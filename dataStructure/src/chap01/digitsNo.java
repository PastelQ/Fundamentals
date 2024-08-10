package chap01;

import java.util.Scanner;

//연습 문제 1-10 양수 입력하여 자릿수를 출력하는 프로그램
public class digitsNo {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("양수를 입력하면 자릿수가 출력됩니다");
		
		do {
			System.out.println("양의 정수를 입력하세요");
			n = stdIn.nextInt();
		} while (n <= 0) ;
		
		// 연산된 자릿수를 저장할 변수
		int answer = 0;
		
		while (n > 0) {
			n /= 10;
			answer ++;
		}
		System.out.println("입력된 값의 자릿수는 "+ answer + " 입니다.");
	}
}
