package chap01;

import java.util.Scanner;

// While 반복문을 이용해 1부터 n까지의 합 구하기
class SumWhile {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구하여라");
		System.out.println("n값 : ");
		int n = stdIn.nextInt();
		
		if(n>0) {
			int sum = 0; // 합의 값 담을 변수 초기화
			int i = 1;   // 반복 숫자 초기값
			
			while(i <= n) {
				sum += i; // sum = sum + i; 와 같음
				i++;	  // i = i + 1; 와 같음
			}
			System.out.println("1부터 " + n + "까지의 값은 " + sum + "입니다.");
		} else {
			System.out.println("양수를 입력해 주세요.");
		}
	}
}
/* while문 순서도(사용된 if문 제외한 순서도)

1.처리 : sum <- 0
2.처리 : i <- 1
3.판단 : i는 n 이하 (No : n 이하일 경우 종료(다음로직으로))
4.처리 : i <- sum + i
5.처리 : i <- i + 1 
 -> 3.판단으로 다시 돌아감 */