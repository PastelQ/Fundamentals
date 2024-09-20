package chap01;

import java.util.Scanner;

// 직각이등변삼각형을 출력하는 부분을 메서드를 만들어 작성
public class Triangle {
	
	// 왼쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 왼쪽 위가 직각인 이등변 삼각형을 출력 - 본인 작성
	static void triangleLU(int n) {
		for(int i=n; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//  왼쪽 위가 직각인 이등변 삼각형을 출력 - 책 정답 버전
//	static void triangleLU(int n) {
//		for(int i=1; i<=0; i++) {
//			for(int j=1; j<=n-i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
	// 오른쪽 위가 직각인 이등변 삼각형을 출력 
	static void triangleRU(int n) {
		for(int i=1; i<=n; i++) { // 행
			for(int j=1; j<=i-1; j++) { // 공백
				System.out.print(" ");
			}
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleRB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 실행 클래스, 하기 메서드를 바꿔 원하는 형태의 직각이등변삼각형을 출력할 수 있음
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		System.out.println("직각이등변삼각형을 출력합니다");
		
		do {
			System.out.println("양수를 입력해 크기를 지정하세요");
			n = stdIn.nextInt();
		} while(n<=0);
		
		triangleRB(n);
	}
}
