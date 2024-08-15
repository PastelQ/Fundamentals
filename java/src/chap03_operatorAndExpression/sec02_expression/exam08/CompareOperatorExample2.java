package chap03_operatorAndExpression.sec02_expression.exam08;

// 비교 연산자
public class CompareOperatorExample2 {

	public static void main(String[] args) {
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println("v2 == v3 : " + (v2 == v3)); // true
		
		// 예외 : 실수
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println("v4 == v5 : " + (v4 == v5)); // false
		// 실수의 저장 방식의 경우(부동 소수점 방식) 0.1일 정확히 표현할 수 없기 때문에
		// 0.1f 의 경우 0.1의 근사값으로 표현되어 0.1보다 큰 값이 되어버림
		
		// 해결 방법 : 피연산자를 모두 float 타입으로 변환하여 비교 및 정수타입으로 변환해서 비교
		System.out.println("(float)v4 == v5" + ((float)v4 == v5)); // true : 여기서는 float로 강제 형변환
	}
}