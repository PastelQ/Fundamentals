package chap04_conditionalStatementAndLoop.sec02_loop.exam09;

// 바깥쪽 반복문 종료 / 반복문에 라벨 붙이기
// 반복문이 중첩되어 있을 경우 가장 가까운 반복문만 종료하고 바깥 반복문은 종료하지 않음
// 해당 부분까지 종료시키려면 바깥쪽 반복문에 라벨을 붙이고 break 라벨명;을 사용
public class BreakOutterExample {

	public static void main(String[] args) {
		// Outter : 라벨 붙여 구분
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++ ) {
				System.out.println(upper + "-" + lower);
				
				if(lower=='g') {
					break Outter;	// 라벨을 명시하여 바깥의 반복문까지 종료
				}
			}
		}
		System.out.println("프로그램 종료");
	}
}
