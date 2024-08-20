package chap04_conditionalStatementAndLoop.sec01_conditionalStatement.exam02_else;

// If문 - else 사용
public class IfElseExample {

	public static void main(String[] args) {
		
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급 A");
		} else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급 B");
		}
	}
}