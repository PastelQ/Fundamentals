package chap14_IOStream.chap01_inputOutputStream.exam04_inputStream;

import java.io.FileInputStream;
import java.io.InputStream;

/* Byte 입력 스트림 (InputStream)
 - InputStream : 바이트 기반 입력 스트림의 최상위 클래스(Abstract Class)
 - 모든 바이트 기반 입력 스트림이 기본적으로 가져야 할 메서드 정의 
 * read() : 입력 스트림으로부터 1byte 를 읽고 int(4byte) 타입으로 리턴
 - 리턴된 4byte 중 끝 1byte에만 데이터가 들어 있음
 - 더 이상 입력 스트림으로부터 Byte를 읽을 수 없다면 -1를 리턴하며 해당 부분을 이용해
  읽을 수 있는 마지막 Byte까지 반복해 1byte 씩 읽을 수 있음 */
public class ReadExample {

	public static void main(String[] args) throws Exception{
		
		// 데이터 출발지를 해당 경로로 하는 바이트 기반 파일 입력 스트림을 생성
		InputStream is = new FileInputStream("C:/icanjava/StudyWorkSpace/javaIO/test1.db");
		
		while(true) {
			// 1byte씩 읽기
			int data = is.read();
			// 파일 끝에 도달했을 경우 -1을 리턴하는 성질을 이용해 반복 종료
			if(data == -1) {
				break;
			}
			System.out.println(data);
		}
		is.close();
	}
}