package chap03_operatorAndExpression.sec02_expression.exam06;

// 문자열 결합 연산자(+)
public class StringConcatExample {

	public static void main(String[] args) {
		
		String str1 = "JDK" + 6.0; // JDK6.0
		String str2 = str1 + " 특징"; // JDK6.0 특징
		
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; // JDK33.0
		String str4 = 3 + 3.0 + "JDK"; // 6.0JDK
		
		System.out.println(str3);
		System.out.println(str4);
	}
}
// 결합연산자는 2개의 피연산자 중 하나라도 문자열일 경우 진행되지만
// str4의 경우 먼저 정수+실수가 연산되기 때문에 이후 6.0과 JDK 문자열의 결합 연산을 진행
// 결합 연산자의 경우 먼저 연산되는 것에 따라 결과가 달라질 수 있어 주의 필요