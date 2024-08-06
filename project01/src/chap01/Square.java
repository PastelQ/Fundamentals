package chap01;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("정사각형을 출력합니다");
		
		do {
			System.out.println("변의 길이 : ");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		for(int i=1; i<=n; i++) {
			System.out.println("*".repeat(n));
		}
	}
}
