package chap04_conditionalStatementAndLoop.sec01_conditionalStatement.exam07_charType;

// char 타입의 switch문 
// char 타입 변수를 이용하여 알파벳 대소문자 관계 없이 동일하게 처리
public class SwitchCharExample {

	public static void main(String[] args) {
		
		char grade = 'B';
		
		// 대문자, 소문자를 함께 케이스에 입력
		switch(grade) {
			case 'A' :
			case 'a' :
				System.out.println("우수 회원입니다.");
				break;
				
			case 'B' :
			case 'b' :
				System.out.println("일반 회원입니다.");
				break;
				
			default :
				System.out.println("손님입니다.");
		}
	}

}
