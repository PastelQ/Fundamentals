package chap14_IOStream.chap01_inputOutputStream.exam05_inputStreamReadArrayLength;

import java.io.FileInputStream;
import java.io.InputStream;

/* 입력 스트림에서 배열의 길이만큼 읽고 해당 배열에 저장(read(byte[] b) 사용)
 - 매개값으로 주어진 배열의 길이만큼 Byte를 읽고 해당 배열에 저장
 - 실제로 읽은 Byte 수가 배열의 길이보다 적을 경우 읽은 수만큼만 리턴 
 - 입력 스트림으로부터 바이트를 더 이상 읽을 수 없다면 -1 리턴 */
public class ReadExample {

	public static void main(String[] args) throws Exception{
		
		// 데이터 출발지가 해당 경로로 하는 바이트 기반 파일 입력 스트림 생성
		InputStream is = new FileInputStream("C:/icanjava/StudyWorkSpace/javaIO/test1.db");
		
		// 길이 100인 배열 생성
		byte[] buffer = new byte[100];
		
		while(true) {
			// read(byte[] b) : 배열 길이만큼 읽기
			int readByteNum = is.read(buffer);
			
			// 입력 스트림부터 바이트를 더 이상 읽을 수 없다면 -1 리턴하는 성질을 이용해 반복 종료
			if(readByteNum == -1) {
				break;
			}
			
			for(int i=0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		// 입력 스트림 자원 해제
		is.close();
	}
}