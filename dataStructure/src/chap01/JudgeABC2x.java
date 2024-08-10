package chap01;

import java.util.Scanner;
/* JudgeABC2와 동일한 분기점, 기능을 가진 클래스
 ! 분기점이 총 4개
*/
public class JudgeABC2x {

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
		} else ; 
		// JudgeABC2의 코드는 이것과 동일하다고 할 수 있음 (else ;)
		// 동일하게 분기점은 4개로 나눠짐
	}
}
