package chap03_operatorAndExpression.sec02_expression.exam10;

// 대입 연산자 : 모든 연산자들 중 가장 낮은 연산 순위를 가짐
// ! 주의 -> 진행 방향이 우에서 좌로 시작되기 때문에 a=b=c=5라는 예시에서 하기 순서로 연산 진행
/* 1. c = 5
 * 2. b = c
 * 3. a = b */
public class AssignmentOperatorExample {

	public static void main(String[] args) {

		int result = 0;
		
		result += 10;
		System.out.println("result : " + result); // 10
		
		result -= 5;
		System.out.println("result : " + result); // 5
		
		result *= 3;
		System.out.println("result : " + result); // 15
		
		result /= 5;
		System.out.println("result : " + result); // 3
	}
}