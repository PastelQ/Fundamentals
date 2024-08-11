package chap02_variableAndType.sec03_typeConversion.exam01;

// 자동 타입 변환이 발생하는 다양한 코드 예시
public class PromotionExample {
	
	public static void main(String[] args) {
		
		// 작은 허용 범위 타입이 큰 타입으로 저장될 때 발생
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + intValue);
		
		// 정수 타입이 실수 타입으로 저장될 때에는 무조건 자동 타입 변환
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	}

}
