package chap14_IOStream.chap02_filterStream.exam01_characterConvertStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/* 보조 스트림(Filter Stream)
 - 다른 스트림과 연결이 되어 여러가지 편리한 기능을 제공해주는 보조 스트림
 - 자체적으로 입출력을 수행할 수 없기 때문에 입출력 소스와 바로 연결되는 
  In/OutputStream, Reader/Writer 등에 연결해 입출력 수행
 - 문자 변환, 입출력 성능 향상, 기본 타입 입출력 등의 기능을 제공
 * 프로그램은 입/출력 스트림으로부터 직접 데이터를 읽거나 보내지 않고 
  보조 스트림에서 제공하는 기능을 이용해 데이터를 읽거나 보냄 
 * 보조 스트림 연결하기(문법)
  - 보조스트림 변수 = new 보조스트림(연결스트림)
 ex)
  InputStream is = ...									// 연결스트림 생성
  InputStreamReader reader = new InputStreamReader(is)	// 보조스트림 생성 시 연결될 스트림을 생성자 인자로 대입 
 ! 여기서 추가로 보조스트림의 매개값으로 또 다른 보조 스트림이 될 수 있음(보조스트림 연속적으로 연결할 수 있음)
 ex) 
  BufferedReader br = new BufferedReader(reader) 		// 보조스트림 변수를 새로운 보조스트림 인수로 대입 */
/* 문자 변환 보조 스트림(Character Convert Stream)
 - 소스 스트림이 Byte 기반 스트림이면서 입출력 데이터가 문자라면 Reader/Writer로 변환해서 사용 고려
  > 문자의 입출력은 Reader / Writer가 더 편리하기 때문
 1. OutputStreamWriter : 바이트 기반 출력 스트림에 연결되어 문자 출력 스트림인 Writer로 변환
 2. InputStreamReader : 바이트 기반 입력 스트림에 연결되어 문자 입력 스트림인 Reader로 변환 */
/** 문자 변환 보조 스트림(Character Convert Stream/Filter Stream) **/
public class CharacterConvertStreamExample {
	
	/** 실행 메서드 **/
	public static void main(String[] args) throws IOException {
		
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
	/** 출력 스트림에 보조 스트림 연결 **/
	public static void write(String str) throws IOException {
		// 해당 경로로 Byte 기반 출력 스트림 생성 
		FileOutputStream fos = new FileOutputStream("C:/icanjava/StudyWorkSpace/javaIO/test1.txt");
		// 상기 스트림을 문자 변환 보조 스트림 연결
		Writer writer = new OutputStreamWriter(fos);
		
		writer.write(str);	// 문자열을 메서드 매개변수로 받아 출력(Writer로 변환 후 메서드)
		writer.flush();		// 버퍼에 남은 데이터 모두 출력
		writer.close();		// 자원 해제
	}
	
	/** 입력 스트림에 보조 스트림 연결 **/
	public static String read() throws IOException {
		// 해당 경로로 Byte 기반 입력 스트림 생성
		FileInputStream fis = new FileInputStream("C:/icanjava/StudyWorkSpace/javaIO/test1.txt");
		// 상기 스트림을 문자 변환 보조 스트림 연결
		Reader reader = new InputStreamReader(fis);
		
		// 크기 100의 char[] 생성
		char[] buffer = new char[100];
		// 보조스트림을 이용해 문자 입력
		int readCharNum = reader.read(buffer);
		reader.close(); 	// 자원 해제
		
		// char[]에서 읽은 수만큼 문자열로 변환(String 생성자 오버로딩)
		String data = new String(buffer, 0, readCharNum);
		return data;
	}
}