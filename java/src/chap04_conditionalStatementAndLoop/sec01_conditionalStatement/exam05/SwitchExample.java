package chap04_conditionalStatementAndLoop.sec01_conditionalStatement.exam05;

// switch 문
public class SwitchExample {

	public static void main(String[] args) {
		
		// 난수 생성하여 숫자 추출
		/* 난수 도출 과정
		 1. Math.random() -> 0이상 1.0미만의 실수 반환
		 2. (Math.random() * 6) + 1 -> 0~6.0까지의 실수를 반환하고 1을 더해 1부터 7미만까지의 실수
		 3. (int)(Math.random() * 6) + 1 -> int 형변환으로 1~6까지의 정수 반환
		 */
		int num = (int)(Math.random() * 6) + 1;
		
		switch(num) {
			
		case 1 : 
			System.out.println("1번이 나왔습니다.");
			break;
		case 2 :
			System.out.println("2번이 나왔습니다.");
			break;
		case 3 :
			System.out.println("3번이 나왔습니다.");
			break;
		case 4 :
			System.out.println("4번이 나왔습니다.");
			break;
		case 5 :
			System.out.println("5번이 나왔습니다.");
			break;
		default :
			System.out.println("6번이 나왔습니다.");
		}
	}
}
