package chap14_IOStream.chap02_filterStream.exam05_printerStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

/* 프린터 보조 스트림(PrintStream/PrintWriter)
 - 프린터와 유사하게 출력하는 print(), println() 메서드를 가지고 있는 보조 스트림
  > System.out이 PrintStream 타입이기 때문에 print()/println() 사용 가능
 - println() 의 경우 출력할 데이터 끝에 개행 문자인 '\n'을 추가하여 줄바꿈이 일어남
 - print()/println()의 경우 출력할 데이터 타입에 따라 매개변수 타입이 다르게 오버로딩되어 있음 */
public class PrintStreamExample {

	public static void main(String[] args) throws Exception {
		
		// 바이트 기반 출력 스트림 생성 및 PrintStream 보조 스트림 연결
		FileOutputStream fos = new FileOutputStream("C:/icanjava/StudyWorkSpace/javaIO/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		// 라인 단위로 문자열 출력
		ps.println("[프린터 보조 스트림]");
		ps.print("마치");
		ps.println("프린터가 출력하는 것처럼");
		ps.print("데이터를 출력합니다.");
		
		ps.flush(); // 버퍼에 잔류하는 문자열을 전부 내보냄
		ps.close(); // 출력 스트림 자원 해제
	}
}