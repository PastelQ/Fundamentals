package chap03_operatorAndExpression.sec02_expression.finalTest;

import java.util.Scanner;

// 키보드로 두 실수를 입력 받고 첫번째 수에서 두번째 수를 나눈 결과를 받음
// ! 두번째 수에 0, 0.0이 입력되었을 경우 '결과 : 무한대' 출력
public class ScannerDivision {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		// 입력 받을 실수, 결과
		double a, b, result;
		
		
		System.out.println("실수를 입력하세요. \n 첫번째 : ");
		a = stdIn.nextDouble();
		System.out.println("두번째 : ");
		b = stdIn.nextDouble();
		
		if(b!=0 || b!=0.0) {
			result = a/b;
			System.out.println("결과 : " + result);
		} else {
			System.out.println("결과 : 무한대");
		}
	}
}
