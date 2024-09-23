package chap11_basicJavaAPI.sec01_javalangPackage.exam10_stringClass;

// String 클래스 (java.lang.String) : 
/* 자바의 문자열은 java.lang 패키지의 String 클래스의 인스턴스로 관리됨
 소스 상 문자열 리터럴은 String 객체로 자동 생성되지만 String 클래스의 다양한 생성자를 이용해
 직접 String 객체를 생성할 수 있음
 이 때 어떤 생성자를 이용해 String 객체를 생성할 지는 제공되는 "매개값의 타입"에 달려 있음 */ 

/** 생성자의 인수를 byte[]로 지정하여 byte[]을 문자열로 변환하는 클래스 **/
public class ByteToStringExample {

	public static void main(String[] args) {
		
		// byte[] 값 목록으로 생성
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		// 배열 전체를 String 객체로 생성
		String str1 = new String(bytes);
		System.out.println(str1);
		
		// 배열의 인덱스 6의 위치부터 길이 4만큼 String 객체로 생성
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}
}
/* 사용 빈도수가 높은 생성자들 (byte[]을 예시)
 // 배열 전체를 String 객체로 생성
 1. String str = new String(byte[] bytes);
 
 // 지정한 문자셋으로 디코딩
 2. String str = new String(byte[] bytes, String charsetName);
 
 // 배열의 offset 인덱스 위치부터 length만큼 String 객체로 생성
 3. String str = new String(byte[] bytes, int offset, int length);
 
 // 3번 예시에서 지정한 문자셋으로 디코딩까지 포함
 4. String str = new String(byte[] bytes, int offset, int length, String charsetName); */