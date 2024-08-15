package chap04_conditionalStatementAndLoop.sec01_conditionalStatement.exam08;

// String 타입의 switch문
// String 타입 변수를 이용하여 직급별 월급 출력
public class SwitchStringExample {
	
	public static void main(String[] args) {
		
		String position = "과장";
		
		switch(position) {
			case "부장" :
				System.out.println("700만원");
				break;
			case "과장" :
				System.out.println("500만원");
				break;
			default :
				System.out.println("300만원");
		}
	}
}
