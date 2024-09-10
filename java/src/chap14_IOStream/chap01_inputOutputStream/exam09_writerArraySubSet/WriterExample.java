package chap14_IOStream.chap01_inputOutputStream.exam09_writerArraySubSet;

import java.io.FileWriter;
import java.io.Writer;

/* 배열 일부 출력하기(write(Char[] cbuf, int off, int len) 사용)
 - int off : Char 배열의 인덱스
 - int len : 출력할 배열의 길이
 cbuf[off] 부터 len개의 문자를 출력 스트림으로 내보냄 */
public class WriterExample {

	public static void main(String[] args) throws Exception{
		// Data 도착지를 해당 경로로 하는 문자 기반 파일 출력 스트림을 생성
		Writer writer = new FileWriter("C:/icanjava/StudyWorkSpace/javaIO/test9.txt");
		
		char[] array = { 'A', 'B', 'C', 'D', 'E' };
		
		// array 배열의 1번 인덱스부터 3개 출력
		writer.write(array, 1, 3);
		
		// 출력 버퍼에 잔류하는 모든 문자를 출력
		writer.flush();
		
		// 출력 스트림 닫기(자원 해제)
		writer.close();
	}
}