package chap11_basicJavaAPI.sec01_javalangPackage.exam24_stringToPrimitiveType;

// 문자열 -> 기본타입 값으로 변환
/* Wrapper Class의 주요 용도는 기본 타입의 값을 Boxing해 포장 객체로 만드는 것이나,
  문자열을 기본 타입 값으로 변환할 때에도 많이 사용됨
  
 * 기본타입 변수명 = 포장객체.parse기본타입(문자열)
  - parse기본타입 -> 기본타입의 첫글자는 대문자로(Camel Case) */
public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		
		// 기본타입 변수명 = 포장객체.parse기본타입("문자열");
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		System.out.println("value3 = " + value3);
	}
}