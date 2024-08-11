package chap02_variableAndType.sec03_typeConversion.exam04;

// 정수 타입의 연산(int 타입보다 허용 범위가 더 클 경우)
// int 타입보다 허용 범위가 더 큰 long 타입이 피연산자로 사용될 경우 다른 피연산자는 이전과 마찬가지로
// long 타입으로 변환하고 연산을 수행함 -> 연산 결과를 long 타입 변수에 저장
public class LongOperationExample {
	
	public static void main(String[] args) {
		
		// 각각 다른 타입 변수
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		
		// 연산 후 long 타입의 변수에 저장
		long result = value1 + value2 + value3;
		
		System.out.println(result);
	}
}