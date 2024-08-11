package chap02_variableAndType.sec03_typeConversion.exam07;

// 기본 타입과 문자열 간의 변환
// 문자열  -> 기본타입 변환 : 변환타입.parse변환타입(변수명);
// 기본타입 -> 문자열 변환  : String.valueOf(기본타입값);
public class PrimitiveAndStringConversionExample {
	
	public static void main(String[] args) {
		
		// 문자열 -> 기본타입
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		System.out.println("하기는 기본 타입");
		System.out.println("value1 :"+value1);
		System.out.println("value2 :"+value2);
		System.out.println("value3 :"+value3);
		
		// 기본타입 -> 문자열
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		System.out.println("\n 하기는 문자열 타입");
		System.out.println("str1 :"+str1);
		System.out.println("str2 :"+str2);
		System.out.println("str3 :"+str3);
	}
}
