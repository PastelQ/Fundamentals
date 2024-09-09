package chap14_IOStream.chap01_inputOutputStream.exam02_outputStreamByteArray;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* 배열 전체를 출력하기(write(byte[] b 메서드)
 - write()에서 인수로 byte[]을 주면 매개값으로 주어진 배열의 모든 바이트를 출력 스트림을 보냄 */
public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 해당 경로로 하는 바이트 기반 파일 출력 스트림 생성
		OutputStream os = new FileOutputStream("C:/icanjava/StudyWorkSpace/javaIO/test2.db");
		
		byte[] array = { 10, 20, 30 };
		
		// 배열을 인수로 write() : 배열의 모든 바이트를 출력(내부 버퍼에 저장)
		os.write(array);
		
		// 출력 버퍼에 잔류하는 모든 바이트 출력
		os.flush();
		
		// 출력 스트림 닫기(리소스 해제)
		os.close();
	}
}