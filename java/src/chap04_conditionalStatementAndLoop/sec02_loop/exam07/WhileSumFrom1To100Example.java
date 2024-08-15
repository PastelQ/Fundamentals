package chap04_conditionalStatementAndLoop.sec02_loop.exam07;

// while문 1~100까지의 합 출력
public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		
		int sum = 0;	// 합의 값을 담을 변수
		int i = 1;		// 루프 카운터 변수
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}
