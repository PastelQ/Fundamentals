package chap04_conditionalStatementAndLoop.sec02_loop.exam05_multiplicationTable;

// 중첩 for문 구구단 출력
public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		
		// 바깥 쪽 for문 (단수 표시)
		for(int i=2; i<=9; i++) {
			System.out.println("*** "+i+"단 ***");
			// 중첩 for문 (1~9까지 곱하는 수)
			for (int j=1; j<=9; j++) {
				System.out.println(i + " x " + j + " = "+i*j);
			}
		}
	}
}
