package chap01;

import java.util.Scanner;

class SumFor {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구하여라");
		System.out.println("n의 값 : ");
		int n = stdIn.nextInt();
		
		// sum : 합친 값을 담을 변수 초기화
		int sum = 0;
		
		// for(초기화; 제어식; 업데이트;){ 명령문(반복) }
		// 반복 시작값 i 정수 1로 지정 / n보다 작을 경우 반복 / i = i+1
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}	
}

/* for문 순서도

1.처리 : sum <- 0
2.루프 범위 시작 : i :1, 1, n
3.처리 : sum <- sum + i
4.루프 범위 종료 : 합계
*/