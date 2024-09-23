package chap04_conditionalStatementAndLoop.sec01_conditionalStatement.exam06_nonBreak;

// break문이 없는 case문 : 스케줄 표시기 프로그램 작성
public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		
		// 8이상 12미만(11이하) 사이의 정수 뽑기 
		int time = (int)(Math.random() * 4) + 8;
		System.out.println("[현재 시각 : " + time + " 시]");
		
		switch(time) {
			case 8 :
				System.out.println("출근합니다.");
			case 9 :
				System.out.println("회의를 합니다.");
			case 10 :
				System.out.println("업무를 봅니다.");
			default :
				System.out.println("외근을 나갑니다.");
		}
	}
}
