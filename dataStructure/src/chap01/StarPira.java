package chap01;

import java.util.Scanner;

// 양수를 입력 받아 n단의 피라미드를 출력하는 메서드 작성하기
public class StarPira {

	static void spira(int n) {
		for(int i=1; i<=n; i++) { // 행
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1;j++) {
				System.out.print("*");
			}
		System.out.println();	
		}
	}
	
	// 책 정답
//	static void spira(int n) {
//		for (int i = 1; i <= n; i++) {					
//			for (int j = 1; j <= n - i; j++)			
//				System.out.print(' ');
//			for (int j = 1; j <= (i-1)*2+1; j++)	// *을 출력하는 부분만 상이
//				System.out.print('*');
//			System.out.println();	
//		}
//	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("피라미드를 출력하는 메서드");
		
		do {
			System.out.println("단의 수(양수)를 입력하세요");
			n = stdIn.nextInt();
		} while (n<=0);
		
		spira(n);
	}
}
