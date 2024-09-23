package chap11_basicJavaAPI.sec01_javalangPackage.exam11_inReadToString;

import java.io.IOException;

// 키보드로부터 읽은 byte[]을 문자열로 변환해보기
// * System.in.read() : 키보드에서 입력한 내용을 매개값으로 주어진 곳에 저장
// ex) Hello 입력 시 -> Hello + 캐리지리턴(\r) + 라인피드(\n) 총 7개의 바이트
public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		
		// System.in.read()를 통해 읽은 byte를 저장하기 위한 배열 생성
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		// 배열에 읽은 byte를 저장하고 읽은 byte 수를 리턴
		int readByteNo = System.in.read(bytes);
		
		// 인덱스 0부터 바이트 수 -2(캐리지리턴, 라인피드 부분은 빼고 진행)
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}
}