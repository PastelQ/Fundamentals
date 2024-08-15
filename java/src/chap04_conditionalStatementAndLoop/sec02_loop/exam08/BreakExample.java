package chap04_conditionalStatementAndLoop.sec02_loop.exam08;

// 반복문 종료 -> break 문 사용
public class BreakExample {

	public static void main(String[] args) {
		
		// 해당 while문은 무한 반복
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			
			// num 값이 6일 경우 break문으로 종료
			if(num==6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
