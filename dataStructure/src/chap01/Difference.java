package chap01;

import java.util.Scanner;

// 연습 문제 1-9 b-a를 출력하는 프로그램(단, b에 입력한 값이 a 이하면 b값 다시 입력)
public class Difference {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요(a)");
		int a = stdIn.nextInt();
		int b;
		
		do {
			System.out.println("두번째 숫자를 입력하세요(a 보다 큰 수를 입력하세요)");
			b = stdIn.nextInt();
		} while (a >= b) ;
		
		System.out.println("b-a는 " + (b-a) + "입니다");
	}
}
