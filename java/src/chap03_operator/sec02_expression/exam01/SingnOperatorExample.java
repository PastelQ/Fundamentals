package chap03_operator.sec02_expression.exam01;

// 부호 연산자 : 부호 연산자(+,- 를 사용할 때에도 결과는 int 타입으로 변수도 int 타입의 변수에 저장해야함)
public class SingnOperatorExample {
	
	public static void main(String[] args) {
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		byte b = 100;
		// byte result3 = -b; -> 컴파일 에러 : 부호 연산의 경우에도 int 타입 값으로 변환
		int result3 = -b;
		System.out.println("result3 = " + result3);
	}
}