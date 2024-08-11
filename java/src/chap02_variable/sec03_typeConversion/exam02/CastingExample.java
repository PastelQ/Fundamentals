package chap02_variable.sec03_typeConversion.exam02;

// 강제 타입 변환 : 큰 허용 범위 타입을 작은 허용 타입으로 강제로 나눠 저장하는 것
// 캐스팅 연산자 괄호() 안에 나누는 단위 타입을 명시 
public class CastingExample {

	public static void main(String[] args) {
		
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(intValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		// 이 경우 소숫점 자리는 생략
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
	}
}
