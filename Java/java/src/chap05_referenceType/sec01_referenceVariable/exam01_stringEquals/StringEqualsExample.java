package chap05_referenceType.sec01_referenceVariable.exam01_stringEquals;

// 참조 변수 String 문자열 비교
public class StringEqualsExample {

	public static void main(String[] args) {
		
		// String은 참조 타입 변수로 일치하는 문자열일 경우 같은 주소를 참조함
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");	// true
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열 같음");	// true
		}
		
		
		// new 연산자를 사용해 String 객체를 직접 생성, 이럴 경우 서로 다른 주소 참조
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");	// true
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");	// true
		}
		
	}	
}
