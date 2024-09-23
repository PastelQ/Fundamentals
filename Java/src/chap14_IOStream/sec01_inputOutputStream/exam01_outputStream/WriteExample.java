package chap14_IOStream.sec01_inputOutputStream.exam01_outputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* 입출력 스트림
 - Java에서 데이터는 Stream을 통해 입출력됨
 - 스트림은 단일 방향으로 연속적으로 흘러가는 것을 의미하며, 프로그램이 출발지냐 혹은 도착지냐에 따라
  사용되는 스트림의 종류가 결정됨
 1. 프로그램이 도착지일 경우 : 흘러온 데이터를 입력 받아야 하므로 입력 스트림 사용
 2. 프로그램이 출발지일 경우 : 데이터를 도착지로 보내야하므로 출력 스트림을 사용 
 
 * 입출력 스트림 종류
 1. 바이트(byte) 기반 스트림 : 그림, 멀티미디어 등 바이너리 데이터를 읽고 출력할 때 사용
 - 최상위 클래스 : InputStream / OutputStream
 2. 문자(character) 기반 스트림 : 문자 데이터를 읽고 출력할 때 사용
 - 최상위 클래스 : Reader / Writer */
/* Byte 출력 스트림 (OutputStream)
 - OutputStream은 바이트 기반 출력 스트림의 최상위 클래스(Abstract Class)
 - 모든 바이트 기반 출력 스트림이 기본적으로 가져야 할 메서드가 정의되어 있음 */

/** 1byte씩 출력하기 **/
public class WriteExample {

	public static void main(String[] args) throws Exception {
		
		// 데이터 도착지 설정 : "test1.db"로 하는 바이트 기반 파일 출력 스트림 생성
		OutputStream os = new FileOutputStream("C:/icanjava/StudyWorkSpace/javaIO/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		// 1byte씩 출력
		os.write(a);
		os.write(b);
		os.write(c);
		
		
		os.flush(); // 출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close(); // 출력 스트림 닫기
	}
}