package chap04_conditionalStatementAndLoop.sec01_conditionalStatement.exam01;

// 조건문(If문)
public class IfExample {

	public static void main(String[] args) {
		
		// 평가 받을 값을 대입한 변수
		int score = 93;
		
		// 중괄호 사용하여 If문 조건이 true일 경우 블록 내부의 문장들이 실행됨
		if(score >= 90) {
			System.out.println("점수가 90점보다 큽니다");
			System.out.println("등급은 A입니다");
		}
		
		// 중괄호를 사용하지 않을 경우 : 조건식 중 실행해야 할 문장이 하나밖에 없다면 생략이 가능하나
		// 하기에서는 2번째의 경우 if문과 상관 없이 출력됨
		if(score < 90) 
			System.out.println("점수가 90점 미만입니다"); // 이 부분만 if문으로 인한 출력
			System.out.println("등급은 B입니다"); // 잘 못된 예시 : 무조건 출력
	}
}