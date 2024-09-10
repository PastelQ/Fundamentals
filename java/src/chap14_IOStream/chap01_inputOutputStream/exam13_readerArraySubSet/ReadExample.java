package chap14_IOStream.chap01_inputOutputStream.exam13_readerArraySubSet;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/* 지정한 길이만큼 읽기(read(char[] cbuf, int off, int len) 사용)
 - int off : 출력할 cbuf의 시작 인덱스
 - int len : 출력할 길이
 - 입력 스트림으로부터 len개의 문자만큼 읽고 매개값으로 주어진 문자 배열에서 cbuf[off]부터 len개까지 저장
 - 실제로 읽은 문자 수가 적을 경우에는 읽은 수만큼만 리턴
 - 입력 스트림으로부터 문자를 더 이상 읽을 수 없을 경우 -1 리턴 */
/** 지정한 길이만큼 읽기 **/
public class ReadExample {

	public static void main(String[] args) throws IOException {
		// Data 출발지를 해당 경로로 하는 문자 기반 파일 입력스트림 생성
		Reader reader = new FileReader("C:/icanjava/StudyWorkSpace/javaIO/test9.txt");
		
		// 길이 5의 배열 생성
		char[] buffer = new char[5];
		
		// 입력 스트림으로부터 3개의 글자를 읽고 buffer[2]부터 각각 저장(3글자)
		int readCharNum = reader.read(buffer, 2, 3);
		
		if(readCharNum != -1) { // 읽은 문자가 있다면
			// 배열 전체를 읽고 출력
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		// 입력 스트림 닫기(리소스 해제)
		reader.close();
	}
}