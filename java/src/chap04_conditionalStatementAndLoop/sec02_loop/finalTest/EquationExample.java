package chap04_conditionalStatementAndLoop.sec02_loop.finalTest;

// 중첩 for문을 이용하여 방정식 [4x+5y = 60]의 모든 해를 구해 (x,y) 형식으로 출력
public class EquationExample {

	public static void main(String[] args) {
		// x의 값 for 문
		for(int x = 1; x<=10; x++) {
			// y의 값 for 문
			for(int y = 1; y<=10; y++) {
				// 해당 부분에서 해가 되는 부분만 출력
				if(4*x + 5*y == 60) {
					System.out.println("(" + x + "," + y +")");
				}
			}
		}
	}
}
