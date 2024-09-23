package chap14_IOStream.sec02_filterStream.finalTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* 확인 문제 : FileReader / BufferedReader를 이용하여 source.txt 내용을 읽고,
  각 라인 번호를 추가해 모니터로 출력하는 프로그램 작성 */
public class AddLineNumberExample {

	public static void main(String[] args) throws IOException {
		
		// 파일 경로
		String filePath = "src/chap14_IOStream/sec02_filterStream/finalTest/AddLineNumberExample.java";
		
		FileReader fr = new FileReader(filePath);   // 문자 기반 입력 스트림 생성
		BufferedReader br = new BufferedReader(fr); // buffered(성능 향상) 보조 스트림 연결
		
		int count = 1;			// 라인 번호
		String readLineData;	// readLine() 리턴값을 담을 변수 * 오답노트 참고
		
		// 콘솔 출력 반복문 * 오답노트 참고
		while((readLineData = br.readLine()) != null) {
			System.out.println(count + ": " + readLineData);
			count++;
		}
		// 입력 스트림 리소스 해제
		br.close();
	}
}