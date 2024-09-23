package chap11_basicJavaAPI.sec01_javalangPackage.finalTest03;

// 확인 문제 : 주어진 Byte[]을 문자열로 변환하기
public class BytesToStringExample {

	public static void main(String[] args) {
		
		byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117 };
		
		// 배열 전체를 String 객체로 생성
		String str = new String(bytes);
		
		System.out.println(str);
	}
}