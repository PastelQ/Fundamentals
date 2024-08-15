package chap04_conditionalStatementAndLoop.sec01_conditionalStatement.exam03;

// else if문 사용
public class ElseIfExample {

	public static void main(String[] args) {
		
		int score = 75;
		
		if(score >= 90) {
			System.out.println("점수 100~90");
			System.out.println("등급 A");
		}else if(score >= 80) {
			System.out.println("점수 90~80");
			System.out.println("등급 B");
		}else if(score >= 70) {
			System.out.println("점수 80~70");
			System.out.println("등급 C");
		}else {
			System.out.println("점수 70 미만");
			System.out.println("등급 D");
		}
	}
}
