package chap02_variable.sec02_variableType.exam01;

// 정수 리터럴
public class IntegerLiteralExample {	
	// 다양한 정수 리터럴을 int 타입 변수에 저장하고 값을 10진수로 출력하는 예제
	public static void main(String[] args) {
		int var1 = 0b1011;	// 2진수
		int var2 = 0206;	// 8진수
		int var3 = 365;		// 10진수
		int var4 = 0xB3;	// 16진수
		
		System.out.println("var1 : "+var1);
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
	}
}
// 프로그래머에 의해 직접 입력된 값을 리터럴(literal)이라고 부르며,
// 자바가 정수로 인식하는 경우는 위의 4가지가 있음