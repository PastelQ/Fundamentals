package chap01;

import java.util.Scanner;
/* JudgeABC1 클래스와 비교 + JudgeABC2x와 동일한 기능
정수를 입력 받아 1을 받으면 A, 2를 받으면 B, 3을 받으면 C
 -> JudgeABC1 과 다르게 나머지 값을 입력 받으면 아무런 실행을 하지 않음
 ! 분기점이 총 4개
*/
public class JudgeABC2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int n = stdIn.nextInt();
		
		if (n == 1) {
			System.out.println("A");
		} else if (n == 2) {
			System.out.println("B");
		} else if (n == 3) {
			System.out.println("C");
		}
	}
}
