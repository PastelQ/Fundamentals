package chap11_basicJavaAPI.sec01_javalangPackage.exam21_valueOf;

// 문자열 변환(valueOf())
/* String 클래스의 valueOf()는 기본 타입의 값을 문자열로 변환
  - String 클래스에는 매개 변수의 타입별로 valueOf() 메서드가 중복정의(Overloading)되어 있음
  ex) static String valueOf(double d) */
public class StringValueOfExample {

	public static void main(String[] args) {
		
		String str1 = String.valueOf(10);	// 정수 타입 -> String 타입 변환
		String str2 = String.valueOf(10.5); // 실수 타입 -> String 타입 변환
		String str3 = String.valueOf(true); // boolean 타입 -> String 타입 변환
	}
}