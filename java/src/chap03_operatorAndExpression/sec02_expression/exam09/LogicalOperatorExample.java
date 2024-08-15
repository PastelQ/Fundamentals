package chap03_operatorAndExpression.sec02_expression.exam09;

// 논리 연산자
// &&,|| 그리고 &,| 의 차이점
// &,|의 경우 두 피연산자를 모두 평가해서 결과 산출
// &&,||의 경우 앞의 피연산자를 평가해 논리곱,합에 맞는 결과를 도출할 경우 2번째 피연산자는 평가하지 않음
// -> 그렇기 때문에 &&,||가 더 효율적일 수 있음
public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		int charCode = 'A';
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자");
		}
		
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자");
		}
		
		if((charCode < 48) && (charCode > 57)) {
			System.out.println("0~9 숫자");
		}
		
		
		int value = 6;
		
		if((value%2 == 0) | (value%3 == 0)) {
			System.out.println("2 혹은 3의 배수");
		}
		
		if((value%2 == 0) || (value%3 == 0)) {
			System.out.println("2 혹은 3의 배수");
		}
	}
}