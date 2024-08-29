package chap11_basicJavaAPI.sec01_javalangPackage.exam14_getBytes;

import java.io.UnsupportedEncodingException;

// 바이트 배열로 변환(getBytes()) : 문자열을 바이트 배열로 변환하기
/* 네트워크로 문자열을 전송하거나, 문자열을 암호화할 때 문자열을 바이트 배열로 변환하는 등
   종종 문자열을 byte[]로 변환하는 경우가 발생함. 아래는 byte[]로 변환하는 메서드 2가지
    1. byte[] bytes = "문자열".getBytes();				// 시스템 기본 문자셋으로 인코딩된 바이트 배열 리턴
    2. byte[] bytes = "문자열".getBytes(Charset charset); // 특정 문자셋으로 인코딩된 바이트 배열 리턴 */
/** 문자열을 byte[]로 인코딩 및 길이 출력 후 다시 String 생성자로 문자열로 디코딩 **/
public class StringGetBytesExample {

	public static void main(String[] args) {
		
		String str = "안녕하세요";
		
		// 기본 문자셋으로 인코딩 및 디코딩
		byte[] bytes1 = str.getBytes();						   // byte[]로 인코딩
		System.out.println("bytes1.length: " + bytes1.length); // 길이 출력
		String str1 = new String(bytes1);					   // 문자열로 디코딩
		System.out.println("bytes1 -> String: " + str1);
		
		// 특정 문자열로 인코딩 및 디코딩
		/* getBytes(Charset charset)의 경우 잘못된 문자셋을 매개값으로 줄 경우
		   예외(UnsupportedEncodingException)가 발생하여 Exception Handling(예외 처리) 필요 */
		try {
			// EUR-KR charset을 이용하여 인코딩 및 디코딩
			byte[] bytes2 = str.getBytes("EUC-KR");					// byte[]로 인코딩
			System.out.println("bytes2.length : " + bytes2.length); // 길이 출력
			String str2 = new String(bytes2);						// 문자열로 디코딩
			System.out.println(str2);
			
			// UTF-8 charset을 이용하여 인코딩 및 디코딩
			byte[] bytes3 = str.getBytes("UTF-8");					// byte[]로 인코딩
			System.out.println("bytes3.length : " + bytes3.length); // 길이 출력
			String str3 = new String(bytes3);						// 문자열로 디코딩
			System.out.println(str3);
			
		} catch(UnsupportedEncodingException e) { 
			e.printStackTrace(); // printStackTrace() : 예외의 원인을 추적할 수 있는 스택 트레이스를 출력
		}	
	}
}