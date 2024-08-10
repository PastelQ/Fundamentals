package chap01;

import java.util.Scanner;

public class SumFor2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n; 		// 사용자 입력 
		
		System.out.println("1부터 n까지의 합을 구합니다");
		
		// do while 문으로 양수가 아닌 수가 입력될 경우 'n의 값' 입력 메세지 출력
		do { // do while 문 : 제어식 없이 1번은 실행 후 이후 제어식을 확인하여 반복 여부를 결정
			System.out.println("n의 값 : ");
			n = stdIn.nextInt();
		} while (n <= 0); 
		
		int sum = 0; // 더한 값을 담은 변수
		
		// for문 반복
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}
