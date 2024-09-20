package chap04_conditionalStatementAndLoop.sec02_loop.finalTest;

import java.util.Scanner;
//오른쪽 아래가 직각인 이등변 삼각형 출력
public class IsoscelesTriangleRB {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int num;
		
		System.out.println("크기를 입력하세요");
		num = stdIn.nextInt();
		
		// 행의 길이 반복
		for(int i=1; i<=num; i++) {
			// 열의 길이 반복 1 : 공백
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
			}
			// 열의 길이 반복 2 : *
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			// 줄바꿈
			System.out.println();
		}
	}
}
	
