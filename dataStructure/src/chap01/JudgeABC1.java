package chap01;

import java.util.Scanner;
/* JudgeABC2 클래스와 비교 
정수를 입력 받아 1을 받으면 A, 2를 받으면 B, 나머지 값은 C
 ! 분기점이 총 3개 
*/
public class JudgeABC1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int n = stdIn.nextInt();
		
		if (n == 1) {
			System.out.println("A");
		} else if (n == 2) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}
}
