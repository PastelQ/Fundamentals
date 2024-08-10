package chap01;

import java.util.Scanner;

// *을 n개 출력하되 w개 마다 줄 바꿈
public class PrintStars1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		// 변수 n : *의 갯수
		// 변수 w : 줄 바꿈이 실행되는 갯수
		int n,w;
		
		// n이 0 이하일 경우 다시 입력
		do {
			System.out.println("n의 값 : ");
			n = stdIn.nextInt();
		} while (n<=0);
		
		// w이 0 이하일 경우, w가 n보다 클 경우 다시 입력
		do {
			System.out.println("w의 값 : ");
			w = stdIn.nextInt();
		} while (w<=0 || w>n);
		
		for (int i=0; i<n; i++) {
			System.out.print("*");
			// w-1 되는 값이 나머지가 될 때 줄 바꿈
			if (i%w == w-1) {
				System.out.println();
			}
		}
		// n 값이 w 값의 배수가 아닐 경우 마지막 줄바꿈 해주는 로직
		if(n%w != 0) {
			System.out.println();
		}
	}
}
// for문을 반복할 때 마다 if문을 실행하여 효율적이지 않음 -> PrintStars2.java에서 개선