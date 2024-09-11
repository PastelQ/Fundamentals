package chap14_IOStream.sec01_inputOutputStream.exam11_reader;

import java.io.FileReader;
import java.io.Reader;

/* Reader : 문자 기반 입력 스트림의 최상위 클래스(Abstract Class)
 - 문자 기반 입력 스트림이 기본적으로 가져야할 메서드가 정의되어 있음
 * read() : 입력 스트림으로부터 1개의 문자(2byte)를 읽고 int(4byte) 타입으로 리턴 
 - 리턴된 4byte 중에 끝에 있는 2byte에 문자 데이터가 들어 있음
  ex) 입력 스트림에서 2개의 문자(총 4byte)가 들어온다면 read()를 호출해 한 문자씩 두 번 읽을 수 있음 
 - 더 이상 입력 스트림으로부터 문자를 읽을 수 없다면 -1를 리턴 */
/** 한 문자씩 읽기 **/
public class ReadExample {

	public static void main(String[] args) throws Exception{
		// 데이터 출발지를 해당 경로로 하는 문자 기반 파일 입력 스트림 생성
		Reader reader = new FileReader("C:/icanjava/StudyWorkSpace/javaIO/test7.txt");
		
		while(true) {
			int data = reader.read(); // 한 문자씩 읽기
			
			// 파일 끝에 도달할 경우 -1을 리턴하는 습성으로 루프 종료
			if(data == -1) {
				break;
			}
			System.out.println((char)data);
		}
		// 입력 스트림 닫음(자원 해제)
		reader.close();
	}
}