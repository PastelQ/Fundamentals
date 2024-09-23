package chap14_IOStream.sec02_filterStream.exam03_bufferedReaderReadLine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/* 라인 단위로 문자열 얻기(readLine() 사용)
 - BufferedReader는 라인 단위로 문자열을 읽는 readLine()를 제공
 - readLine() : 'Enter'키(캐리지리턴(\r) + 라인피드(\n) 이전의 모든 문자열 읽고 리턴
  > 키보드에서 입력한 내용, 파일 내용을 라인 단위로 읽을 수 있음
 - 라인 단위로 문자열을 얻기 위해 readLine()로 반복하여 읽기
  > 더 이상 읽을 라인이 없다면 readLine()은 null 리턴 */
public class ReadLineExample {

	public static void main(String[] args) throws Exception{
		
		// 메인 스트림 생성 : 문자 기반 입력 스트림 얻기
		Reader reader = new FileReader(
			ReadLineExample.class.getResource("language.txt").getPath()
		);
		
		// 보조 스트림 연결
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data = br.readLine();
			// readLine()이 더 읽을 라인이 없다면 null을 리턴하여 반복 종료
			if(data == null) {
				break;
			}
			System.out.println(data);
		}
		// 입력 스트림 닫기
		br.close();
	}
}