package chap04_conditionalStatementAndLoop.sec02_loop.exam02;

// For문 : 1부터 100까지 합 출력
public class ForSumFrom1To100Example {

	public static void main(String[] args) {

		// 1부터 100까지의 합의 값을 담을 변수
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~100의 합 : "+sum);
	}
}