package chap14_IOStream.chap01_inputOutputStream.exam03_outputStreamArraySubSet;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* 배열 일부 출력하기(write() 활용)
 - write(byte[] b, int off, int len) 활용(write()의 오버로딩)
 - int off : 시작 인덱스
 - int len : 시작 인덱스로부터의 길이
 즉, b[off]부터 len개의 바이트를 출력 스트림으로 내보냄 */
public class WriteExample {

	public static void main(String[] args) throws Exception{
		// 데이터 도착지를 해당 경로로 하는 바이트 기반 파일 출력 스트림 생성
		OutputStream os = new FileOutputStream("C:/icanjava/StudyWorkSpace/javaIO/test3.db");
		
		byte[] array = { 10, 20, 30, 40, 50 };
		
		// 배열의 1번 인덱스부터 3개를 출력
		os.write(array, 1, 3);
		
		// 출력 버퍼에 잔류하는 모든 바이트를 출력
		os.flush();
		
		// 출력 스트림 닫음
		os.close();
	}
}