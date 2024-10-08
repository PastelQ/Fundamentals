package chap02_variableAndType.sec03_typeConversion.exam05_operationConversion;

// 연산식에서 자동 타입 변환
public class OperationsPromotionExample {

	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2; -> 컴파일 에러
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2; -> 컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = "+intValue2);
		System.out.println("출력 문자 = "+(char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// int intValue6 = 10 / 4.0;		-> 컴파일 에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		// 실수 나눗셈 : 연산하는 변수 중 하나라도 실수 타입이라면 연산 결과는 실수 타입으로 저장
		double result = (double) x / y;	
		System.out.println(result);
	}
}
