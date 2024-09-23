package chap02_variableAndType.sec03_typeConversion.exam03_integerOperation;

// 정수 타입의 연산 : 정수 타입 중 int 타입보다 작은 byte, short 타입의 경우 
// 산술 연산식에서 피연산자로 사용되면 int 타입으로 자동 타입 변환되어 연산을 수행함
/* 예시 
 byte x = 10;
 byte y = 20;
 
 1. byte result = x + y; -> 컴파일 에러 발생
 2. int result = x + y;  -> 정상 작동 : 연산 결과를 int 변수에 저장 */
public class ByteOperationExample {

	public static void main(String[] args) {
		
		// JavaCompiler는 컴파일 단계에서 연산을 미리 수행할 수 있음
		// 정수 리터럴 10, 20을 연산해서 byte 변수에 담는 것은 가능 -> 이럴 경우 피연산자가 변수가 아니어 int 타입으로 변환 X
		byte result1 = 10+20;
		System.out.println(result1);
		
		// 피연산자의 변수를 int 타입으로 선언
		byte x = 10;
		byte y = 20;
		int result2 = x+y;
		System.out.println(result2);
	}
}
