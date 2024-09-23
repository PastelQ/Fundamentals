package chap14_IOStream.sec02_filterStream.exam02_bufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* 성능 향상 보조 스트림(Buffered Stream)
 - 프로그램이 입출력 소스와 직접 작업하지 않고 중간에 메모리 버퍼와 작업함으로써 실행 성능을 향상시킬 수 있음
 - 프로그램의 실행 성능은 입출력이 가장 늦은 장치를 따라감
  > 컴퓨터 사양이 아무리 좋아도 느린 네트워크 환경이라면 메신저, 게임 등 속도가 느릴 수 밖에 없음
 - 상기 부분에 완전한 해결책은 될 수 없으나, 프로그램이 직접 하드 디스크에 데이터를 보내지 않고 메모리 버퍼에 
  데이터를 보냄으로써 쓰기 속도가 향상될 수 있음
  > 출력 스트림 자체에도 내부에 작은 버퍼를 가지고 있으나 Buffered Stream을 이용하면 메모리 버퍼를
   추가로 제공하여 프로그램의 실행 성능을 향상시킴 */
/* Buffered Stream 종류
 1. BufferedOutputStream / BufferedWriter
 - 프로그램에서 전송한 데이터를 내부 버퍼에 쌓아 두었다가 버퍼가 꽉 차면 모든 데이터를 한 번에 보냄
 - 프로그램 입장에서 보면 메모리 버퍼로 데이터를 고속 전송하기 때문에 출력 성능이 향상되는 효과 얻음
 2. BufferedOutputStream / BufferedReader
 - 입력 소스로부터 자신의 내부 버퍼 크기만큼 미리 데이터를 읽고 버퍼에 저장해 둠
 - 프로그램 입장에서 외부의 입력 소스로부터 직접 읽는 것보다 버퍼로부터 읽음으로써 읽기 성능이 향상 */
/** 파일 복사 성능 테스트 **/
public class NonBufferVsBufferExample {
	
	/** 실행 메서드 **/
	public static void main(String[] args) throws Exception {
		
		/** 기본 입출력 스트림 생성 **/
		// 원본 파일 경로 얻기
		String originalFilePath1 =
				NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		// copy하여 출력할 경로
		String targetFilePath1 = "C:/icanjava/StudyWorkSpace/javaIO/targetFile1.jpg";
		
		FileInputStream fis = new FileInputStream(originalFilePath1); // 입력스트림 생성
		FileOutputStream fos = new FileOutputStream(targetFilePath1); // 출력스트림 생성
		
		
		/** 버퍼 보조 스트림 연결 **/
		// 원본 파일 경로 얻기
		String originalFilePath2 =
				NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		// copy하여 출력할 경로
		String targetFilePath2 = "C:/icanjava/StudyWorkSpace/javaIO/targetFile1.jpg";
		
		FileInputStream fis2 = new FileInputStream(originalFilePath2); // 입력스트림 생성
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2); // 출력스트림 생성
		
		// 버퍼 보조스트림 연결
		BufferedInputStream bis = new BufferedInputStream(fis2); 	
		BufferedOutputStream bos = new BufferedOutputStream(fos2); 
		
		
		/** copy() 사용하여 비교 **/
		// FileIn/OutputStream을 이용한 복사 시간 측정
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때:\t" + nonBufferTime + "ns");
		
		// BufferedIn/OutputStream을 이용한 복사 시간 측정
		long bufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용했을 때:\t" + bufferTime + "ns");
		
		/* 자원 해제
		 - 보조스트림의 리소스를 닫을 경우 보조스트림의 메인스트림의 자원도 해제되는 경우도 많으나
		  일반적으로는 안정성을 고려하여 메인과 보조 모두 닫아주는 것을 권장 */
		fis.close();
		fos.close();
		bis.close();
		bos.close(); 
	}
	
	// field : -1로 초기화 / read()에 사용되며 읽을 데이터가 없으면 다시 -1로 리턴됨
	static int data = -1; // ? 로컬변수로 하는 것이 더 가시성도 좋고 안전할 것 같음..
	
	public static long copy(InputStream is, OutputStream os) throws Exception{
		
		long start = System.nanoTime(); // 시작 시간 저장
		
		while(true) {
			data = is.read();
			// data가 -1일 경우
			if(data == -1) {
				break;
			}
			os.write(data);
		}
		os.flush();
		
		long end = System.nanoTime(); // 끝 시간 저장
		return (end - start); 		  // 복사에 걸린 시간 리턴
	}
}