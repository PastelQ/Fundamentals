package chap01;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 최댓값을 구하여 출력

public class Max3 {
	
	public static void main(String[] args) {
		// Scanner 객체를 생성 / 사용자의 입력을 읽음
		// System.in : 키보드와 연결된 표준 입력 스트림 (standard input stream)
		Scanner stdIn = new Scanner(System.in);
		
		// 사용자에게 3개의 정수 입력 요청
		System.out.println("세 정수의 최댓 값을 구하라");
		
		// 입력한 정수 값을 읽어들임, 호출 시 입력한 정숫값을 얻음
		System.out.println("a의 값: ");
		int a = stdIn.nextInt(); 
		
		System.out.println("b의 값: ");
		int b = stdIn.nextInt();
		
		System.out.println("c의 값: ");
		int c = stdIn.nextInt();
		
		int max = a;
		
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max = c;
		}
		
		System.out.println("최댓값은 " + max + "입니다.");
	}
}
