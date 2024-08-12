package chap03_Operator.sec02_expression.exam04;

// 산술 연산자
public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2; 
		
		int result1 = v1 + v2;
		System.out.println("result1 = " + result1);

		int result2 = v1 - v2;
		System.out.println("result2 = " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3 = " + result3);
		
		// 나누기 : 몫
		int result4 = v1 / v2;
		System.out.println("result4 = " + result4);
		
		// 나누기 : 나머지
		int result5 = v1 % v2;
		System.out.println("result5 = " + result5);
		
		// 피연산자 중 1개를 실수 타입으로 강제 형변환 또는 소숫점의 수를 곱해 실수 타입으로 만든 후 double타입에 넣으면
		// 실수로 나눠진 값을 얻을 수 있음 (여기서는 2.5)
		double result6 = (double)v1 / v2;
		System.out.println("result6 = " + result6);
	}
}
