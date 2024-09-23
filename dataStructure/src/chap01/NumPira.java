package chap01;

import java.util.Scanner;

// 숫자 피라미드 출력하는 메서드 작성
public class NumPira {

	static void npira(int n) {
		for(int i=1; i<=n; i++) {	// 행
			for(int j=1; j<=n-i; j++) {   // 열 공백
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) { // 열 숫자
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("숫자 피라미드를 출력합니다");
		
		do {
			System.out.println("단 수(양수)를 입력하세요");
			n = stdIn.nextInt();
		} while(n<=0);
		
		npira(n);
	}
}
