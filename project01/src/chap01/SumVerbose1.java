package chap01;

import java.util.Scanner;

// 변수 n을 입력하여 1부터 n까지의 합과 그 값을 구하는 과정 출력
public class SumVerbose1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		// 사용자에게 입력 받을 정수 변수 선언
		int n;
		
		System.out.println("1부터 n까지의 합을 구하여라");
		
		// 사용자에게 입력 받을 값이 정수인 지 검사
		do { 
			System.out.println("n값 : ");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		// 합친 값을 담을 변수
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			if(i < n) {
				System.out.println(i+" + "); // 중간 과정
			} else {
				System.out.println(i+" = "); // 마지막 과정
				
			}
			sum += i;
		}
		System.out.println(sum);
	}
}
/* ! 해당 코드는 효율적이지 못함 !
 n의 값대로 for문은 반복을 수행하는데 i = n이 되기 전까지 지속적으로 판단식(i < n)을 qksqhrgka
 마지막 과정을 실행하기 위한 방법을 알고 있음에도 항상 조건을 판단하여 실행하는 것으로 효율 떨어짐 
 
 만약 i = n 이 같을 경우에는 SumVerbose2.java처럼 코드작성 */
