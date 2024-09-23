package chap14_IOStream.sec01_inputOutputStream.exam10_writerString;

import java.io.FileWriter;
import java.io.Writer;

/* 문자열 출력하기(write(String str) 사용)
 - Writer는 문자열을 좀 더 쉽게 내보내기 위해 String을 인수로 받아 출력 스트림으로 보낼 수 있음
 - write(String str, int off, int len)을 통해 문자열의 일부를 출력도 가능 */
public class WriteExample {

	public static void main(String[] args) throws Exception {
		// Data 도착지를 해당 경로로 하는 문자 기반 파일 출력 스트림을 생성
		Writer writer = new FileWriter("C:/icanjava/StudyWorkSpace/javaIO/test10.txt");
		
		// String 문자열 생성
		String str = "ABC";
		
		// 문자열 전체를 출력
		writer.write(str);
		
		// 출력 버퍼에 잔류하는 모든 문자열을 출력
		writer.flush();
		
		// 출력 스트림 닫기(자원 해제)
		writer.close();
	}
}