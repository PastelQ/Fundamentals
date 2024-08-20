package chap06_class.sec04_method.exam04;

// 클래스 내부에서 메소드 호출
public class Calculator {
	
	// 1번 : 더하기 메서드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// 2번 : 평균내주는 메서드
	double avg(int x, int y) {
		double sum = plus(x, y);	// 1번 호출
		double result = sum/2;
		return result;
	}
	
	// 3번 : 실행 메서드
	void execute() {
		double result = avg(7,10);	   // 2번 호출
		println("실행결과 : " + result); // 4번 호출
	}
	
	// 4번 : 출력 메서드
	void println(String message) {
		System.out.println(message);
	}
}