package chap11_basicJavaAPI.sec01_javalangPackage.exam13_stringClassEquals;

// String 클래스의 equals() 재정의
// equals()의 경우 Object의 클래스의 번지 비교 메서드이나, String 클래스가 재정의하여
// 문자열을 비교하도록 변경됨
public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		
		// == 연산자는 각 변수에 저장된 번지를 비교함
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조"); // 출력
		}
		
		// String의 equals()는 문자열을 비교
		if(strVar1 == strVar2) {
			System.out.println("같은 문자열을 가짐"); // 출력
		} else {
			System.out.println("다른 문자열을 가짐");
		}
	}
}