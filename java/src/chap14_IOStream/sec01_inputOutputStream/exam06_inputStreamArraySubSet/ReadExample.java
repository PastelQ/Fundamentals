package chap14_IOStream.sec01_inputOutputStream.exam06_inputStreamArraySubSet;

import java.io.FileInputStream;
import java.io.InputStream;

/* 입력스트림 지정한 길이만큼 읽기(read(byte[] b, int off, int len) 사용)
 - 입력 스트림으로부터 len개의 Byte만큼 읽고, 매개값으로 주어진 Byte[]에 
  [off]부터 len개까지 저장
 - 실제로 읽은 Byte 수가 len개보다 작은 경우 읽은 수만큼만 리턴
 - 입력 스트림으로부터 바이트를 더 이상 읽을 수 없다면 -1 리턴 */
public class ReadExample {

	public static void main(String[] args) throws Exception{
		
		// 데이터 출발지를 해당 경로로 하는 Byte 기반 파일 입력 스트림 생성
		InputStream is = new FileInputStream("C:/icanjava/StudyWorkSpace/javaIO/test3.db");
		
		// 길이 5 배열 생성
		byte[] buffer = new byte[5];
		
		// 입력스트림으로부터 3byte를 읽고 buffer[2] 부터 3개 저장
		int readByteNum = is.read(buffer, 2, 3);
		if(readByteNum != 1) { // 읽어온 Byte가 있다면 내부 for문 진행
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		// 입력 스트림 자원 해제
		is.close();
	}
}