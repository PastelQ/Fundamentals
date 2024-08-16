package chap04_conditionalStatementAndLoop.sec02_loop.finalTest;

// for문을 사용하여 1부터 100까지의 정수 중 3의 배수 총합
public class ForSumMultipleOf3 {

	public static void main(String[] args) {
		// 합계 값을 담을 변수 sum
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			// i를 3으로 나누지 않았을 경우 continue문 실행
			if(i%3 != 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("3의 배수 합 : "+sum);
	}
}
