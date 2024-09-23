package chap01;

import java.util.Scanner;

//연습 문제 1-7 가우스의 덧셈 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램 작성
public class SumGauss {
	
	// 가우스의 덧셈 메서드 
	static int gaussMethod(int n) {
		
		// 나머지는 버리므로 해당 로스를 채우는 연산을 더하기
		// n % 2 가 1이 아닐 경우(0일 경우) : 0
		// n % 2 가 1일 경우 : (n+1)/2 한 값을 더함
		int gauss = (1 + n) * (n/2) + (n % 2 == 1 ? (n + 1)/2 : 0);
		
		return gauss;
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("가우스의 덧셈 : 정수를 입력하세요!");
		int insert = stdIn.nextInt();
		
		System.out.println("덧셈 결과 : "+ gaussMethod(insert));
	}
}
