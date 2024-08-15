package chap03_operator.sec02_expression.exam07;

// 비교 연산자
// 연산을 수행하기 전에 피연산자의 타입을 일치 시킴
// 예시로 'A'가 int 타입으로 변환되어 65로 변환
public class CompareOperatorExample1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1 = " + result1); // true
		System.out.println("result2 = " + result2); // false
		System.out.println("result3 = " + result3); // true
		
		// 유니코드 
		char char1 = 'A'; // 유니코드 'A' = 65
		char char2 = 'B'; // 유니코드 'B' = 66
		
		boolean result4 = (char1 < char2);
		System.out.println("result4 = " + result4); // true
	}
}