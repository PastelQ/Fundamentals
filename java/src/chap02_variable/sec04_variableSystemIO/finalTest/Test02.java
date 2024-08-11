package chap02_variable.sec04_variableSystemIO.finalTest;

import java.util.Scanner;

// Scanner를 이용해 키보드로 입력한 두 수를 덧셈한 결과를 출력하는 프로그램 작성
public class Test02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1번째 수 : ");
		String strNum1 = scanner.nextLine();

		System.out.println("2번째 수 : ");
		String strNum2 = scanner.nextLine();
		
		// 문자열 int로 parse
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		
		// 결과 출력
		System.out.println("결과 : " + result);
	}

}
