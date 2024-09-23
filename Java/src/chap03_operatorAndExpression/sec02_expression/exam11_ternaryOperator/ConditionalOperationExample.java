package chap03_operatorAndExpression.sec02_expression.exam11_ternaryOperator;

// 삼항 연산자
// 1.조건식(피연산자) ? 2.값or연산식(피연산자) : 3.값or연산식(피연산자)
// 1번이 true일 경우 결과는 2번, false일 경우 결과는 3번
public class ConditionalOperationExample {

	public static void main(String[] args) {

		int score = 85;
		
		// 삼항 연산자 2회 이용
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println("점수는 " + score + ", 등급 " + grade + "입니다.");
	}
}