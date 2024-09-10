package chap14_IOStream.chap01_inputOutputStream.exam12_readerReadArrayLength;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/* 배열 길이만큼 읽기(read(char[] cbuf) 사용)
 - 입력 스트림으로부터 인수로 지어진 문자 배열의 길이만큼의 문자를 읽고 배열에 저장
  그 후, 읽은 문자 수 리턴
 - 실제 읽은 문자 수가 배열의 길이보다 적을 경우 읽은 수만큼만 리턴(반복문으로 처리)
 - 입력 스트림으로부터 문자를 더 이상 읽을 수 없다면 -1 리턴 */
public class ReadExample {

	public static void main(String[] args) throws IOException { // IOException 던짐 
		// 데이터 출발지를 해당 경로로 하는 문자 기반 파일 입력 스트림 생성
		Reader reader = new FileReader("C:/icanjava/StudyWorkSpace/javaIO/test8.txt");
		
		// 길이 100인 배열 생성
		char[] buffer = new char[100];
		
		while(true) {
			// 배열의 길이만큼 읽음
			int readCharNum = reader.read(buffer);
			// 입력 스트림에서 더 이상 읽을 값이 없다면 리턴값 -1인 점을 이용해 루프 종료
			if(readCharNum == -1) {
				break;
			}
			// 읽은 문자 수만큼 반복하면서 배열에 저장된 문자 출력
			for(int i=0; i<readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		// 입력 스트림 닫기(자원 해제)
		reader.close();
	}
}