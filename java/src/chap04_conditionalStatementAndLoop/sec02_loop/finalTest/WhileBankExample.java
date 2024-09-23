package chap04_conditionalStatementAndLoop.sec02_loop.finalTest;

import java.util.Scanner;

// while문을 사용한 예금, 출금, 조회, 종료 기능
public class WhileBankExample {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		boolean run = true;	// 프로그램 반복 실행 여부(true 시 반복)
		int balance = 0;	// 메뉴 선택
		int money = 0;		// 현재 총 금액
		int enter = 0;		// 예금, 출금 등 입력 받는 값
		
		while(run) {
			// 기본 선택지 출력문
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			
			// 입력 받음
			System.out.print("선택>");
			balance = Integer.parseInt(stdIn.nextLine());
			
			switch(balance){
				case 1 :
					System.out.print("예금액>");
					enter = Integer.parseInt(stdIn.nextLine());
					money += enter;
					System.out.println("예금액 : " + enter);
					continue;
				case 2 : 
					System.out.print("출금액>");
					enter = Integer.parseInt(stdIn.nextLine());
					money -= enter;
					System.out.println("출금액 : " + enter);
					continue;
				case 3 : 
					System.out.println("조회>");
					System.out.println("잔고 : " + money);
					continue;
				default : 
					run = false;
			}
			System.out.println("프로그램 종료");
		}
		
	}
}
