package chap01;

import java.util.Scanner;

// SumVerbose1 을 개선한 코드 
// 1부터 사용자가 입력한 n까지의 수를 합친 결과 출력
public class SumVerbose2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		// 사용자가 입력 받을 변수 선언
		int n;
		
		// 사용자에게 입력 받을 값이 정수인 지 검사
		do {
			System.out.println("n의 값 : ");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		// 더한 결과를 담은 변수
		int sum = 0;
		
		// n과 i가 같아지기 전까지 연산
		for(int i=1; i < n; i++) {
			System.out.println(i + " + ");
			sum += i;
		}
		
		// n과 i가 같은 수까지 도달
		System.out.println(n + " = ");
		sum += n;
		
		//총 합 출력
		System.out.println(sum);
	}
}
