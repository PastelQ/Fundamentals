package chap04_conditionalStatementAndLoop.sec02_loop.exam03_loopCounterVar;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		// for문 전에 선언하여 for문 내부 블럭 외에서도 사용할 수 있음
		int i = 0; // 루프 카운터 변수
		
		for(i=1; i<=100; i++) {
			sum+=i;
		}
		
		// (i-1) : i++ 후위 연산자로 i를 입력 시 101이 되기 때문에 -1을 추가
		System.out.println("1~" + (i-1) + " 합 :" + sum);
	}
}
