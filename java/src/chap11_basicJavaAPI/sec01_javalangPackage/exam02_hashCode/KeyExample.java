package chap11_basicJavaAPI.sec01_javalangPackage.exam02_hashCode;

import java.util.HashMap;

/** 실행 클래스 **/
public class KeyExample {

	public static void main(String[] args) {
		// Key 객체를 식별키로 사용하여 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key,String>();
		
		// 식별키 new Key(1)로 "홍길동"을 저장
		hashMap.put(new Key(1), "홍길동");
		
		// 식별키 new Key(1)로 "홍길동"을 읽어옴
		// 다른 객체지만 equals(), hashCode() 재정의로 인해 논리적 동등(필드값이 같을 경우 같은 고유값을 가짐)
		String value = hashMap.get(new Key(1));
		System.out.println(value); 
	}
}