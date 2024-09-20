package chap01;

import java.util.Scanner;

// 지정한 갯수의 기호를 중간에 줄 바꿈 없이 연속해서 보여 주는 프로그램 작성
public class Alternative1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("n의 값 : ");
			n = stdIn.nextInt();
		}while (n <= 0);
		
		System.out.println("+와 -를 번갈아 n개 출력합니다");
		
		for(int i=0; i<n; i++) {
			if(i%2 == 0) {
				System.out.print("+"); // 짝수일 경우 +
			}else {
				System.out.print("-"); // 그 외일 경우 -
			}
		}
	}
}
/* ! 해당 프로그램 문제점 !
 1. 반복할 때마다 if문을 실행 시킴 -> i값이 홀수인 지 확인하기 위해 if문을 n번 실행
 2. 변경 시 유연하게 대응이 어려움
  해당 프로그램의 카운터용 변수인 i 값은 0부터 n-1까지 1씩 증가하므로 
  만약 i 값이 0부터 시작하지 않고 시작점을 바꾸면 for문 전체를 수정해야 함
 
 -> 이 문제점을 해결한 코드 : Alternative2.java */