package chap01;

import java.util.Scanner;

public class Alternative2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("n의 값");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		// 입력 받은 n을 2로 나눠 +-를 함께 출력
		for (int i=0; i<n/2; i++) {
			System.out.print("+-");
		}
		
		// 홀수일 경우 (2로 나누었을 때 나머지가 0이 아닐 경우) +를 한 번 출력
		if(n%2 != 0) {
			System.out.println("+");
		}
	}
}