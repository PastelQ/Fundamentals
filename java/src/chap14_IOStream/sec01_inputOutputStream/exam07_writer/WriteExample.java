package chap14_IOStream.sec01_inputOutputStream.exam07_writer;

import java.io.FileWriter;
import java.io.Writer;

/* Writer(문자 기반 출력 스트림)
 - 문자 기반 출력 스트림의 최상위 클래스(Abstract Class)
 - 모든 문자 기반 출력 스트림이 기본적으로 가져야 할 메서드가 정의되어 있으며,
  모든 문자 기반 출력 스트림은 Writer를 상속 */
/** 한 문자씩 출력하기 **/
public class WriteExample {

	public static void main(String[] args) throws Exception {
		// Data 도착지를 해당 경로로 하는 문자 기반 파일 출력 스트림 생성
		Writer writer = new FileWriter("C:/icanjava/StudyWorkSpace/javaIO/test7.txt");
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		// 한 문자 씩 출력
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		// 출력 버퍼에 잔류하는 문자 출력
		writer.flush();
		
		// 출력 스트림 닫음
		writer.close();
	}
}