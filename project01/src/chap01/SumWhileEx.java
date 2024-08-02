package chap01;

import java.util.Scanner;

//연습 문제 1-6 SumWhile 클래스에서 while 문이 종료될 때 변수 i 값이 n+1이 되는지 확인
public class SumWhileEx {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구하여라");
		System.out.println("n값 : ");
		int n = stdIn.nextInt();
		
		if(n>0) {
			int sum = 0; 
			int i = 1;   
			
			while(i <= n) {
				sum += i; 
				i++;
			}
			System.out.println("1부터 " + n + "까지의 값은 " + sum + "입니다.");
			System.out.println("i의 값 : " + i);
		} else {
			System.out.println("양수를 입력해 주세요.");
		}
	}
}
