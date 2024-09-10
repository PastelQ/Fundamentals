package chap14_IOStream.chap01_inputOutputStream.exam08_writerCharArray;

import java.io.FileWriter;
import java.io.Writer;

// 배열 전체 출력하기(write(char[] cbuf) 사용)
// write()의 인수로 char[]를 대입하여 배열의 모든 문자를 출력 스트림으로 보냄

public class WriteExample {

	public static void main(String[] args) throws Exception{
		// Data 도착지를 해당 경로로 하는 문자 기반 파일 출력 스트림 생성
		Writer writer = new FileWriter("C:/icanjava/StudyWorkSpace/javaIO/test8.txt");
		
		char[] array = { 'A', 'B', 'C' };
		
		// 배열의 모든 문자 출력
		writer.write(array);
		
		// 출력 버퍼에 잔류하는 모든 문자 출력
		writer.flush();
		
		// 출력 스트림 닫기(자원 해제)
		writer.close();
	}
}