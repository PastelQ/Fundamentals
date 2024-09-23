package chap04_conditionalStatementAndLoop.sec02_loop.finalTest;

// 2개의 주사위를 던졌을 때 나오는 눈 출력, 눈의 합이 5가 될 때까지 반복하는 while문
public class WhileTwoDiceExample {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		while(sum!=5) {
			sum = 0; // sum 값 초기화
			// 첫째, 둘째 눈금을 랜덤 메서드로 난수 생성
			int first = (int)(Math.random()*6)+1;
			int second = (int)(Math.random()*6)+1;
			// first, second를 합친 값
			sum = first + second;
			System.out.println("눈1:" + first + " / 눈2:" + second + " / 합계:"+sum);
		}
	}
}
