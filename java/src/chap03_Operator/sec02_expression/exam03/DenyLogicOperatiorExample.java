package chap03_Operator.sec02_expression.exam03;

// 논리 부정 연산자
// True, False를 번갈아 놓는 토글 같은 형태
public class DenyLogicOperatiorExample {

	public static void main(String[] args) {
		
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
	}
}