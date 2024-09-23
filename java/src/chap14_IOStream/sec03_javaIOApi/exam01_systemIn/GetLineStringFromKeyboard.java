package chap14_IOStream.sec03_javaIOApi.exam01_systemIn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 입출력 관련 API
 - Java 표준 API에서는 입출력/보조 스트림을 이용해 다양한 기능을 제공
 - 그중 대표적으로 System.in / System.out이 있음
  1. System.in  : InputStream 타입
  2. System.out : PrintStream 타입 
 * 콘솔(Console) : 시스템을 사용하기 위해 키보드로 입력 받고 모니터로 출력하는 소프트웨어 
 - 리눅스/유닉스의 경우 terminal, 윈도우의 경우 명령프롬프트(cmd)에 해당
 - Java의 경우 콘솔로부터 데이터를 입력 받을 때 System.in을 사용하고,
  콘솔에 데이터를 출력할 때 System.out을 사용(그 밖 에러 출력 시 System.err 사용) */

/* System.in Field
 - Java는 Console에서 키보드의 데이터를 입력 받을 수 있도록 System 클래스의 in 정적 필드를 제공
 - InputStream 타입의 필드로 InputStream 변수로 참조 가능(InputStream is = System.in;) */

/** 키보드로부터 라인 단위 문자열 얻기 **/
public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws IOException{
		
		InputStream is = System.in;						// InputStream 타입 필드로 InputStream 변수로 참조
		Reader reader = new InputStreamReader(is);		// 문자 기반 Reader로 변경 보조스트림 연결
		BufferedReader br = new BufferedReader(reader); // 라인 단위로(readLine()) 문자열을 읽기 위해 Buffered 보조 스트림 연결
		
		while(true) {
			System.out.println("입력하세요.");
			String lineStr = br.readLine(); // 라인 단위로 문자열을 읽어 변수 저장
			
			// 사용자가 "q" 혹은 "quit"을 입력할 경우 while 반복문 종료
			if(lineStr.equals("q") || lineStr.equals("quit")) { break; }
			
			System.out.println("입력된 내용 : " + lineStr);
			System.out.println(); // 줄바꿈
		}
		// 입력 스트림 닫기(리소스 해제)
		br.close();
	}
}