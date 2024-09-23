package chap01;

import java.util.Scanner;

// 정숫값의 부호 (양수/음수/0)을 판단하는 프로그램 
public class JudgeSign {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int n = stdIn.nextInt();
		
		if (n > 0) {
			System.out.println("n은 양수입니다.");
		} else if (n < 0) {
			System.out.println("n은 음수입니다.");
		} else {
			System.out.println("n은 0입니다.");
		}
	}
}
