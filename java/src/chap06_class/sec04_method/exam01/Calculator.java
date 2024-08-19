package chap06_class.sec04_method.exam01;

// method : 객체의 동작에 해당되는 중괄호 {} 블럭
// 구조 : 리턴타입 메서드이름(매개변수 타입 매개변수명){실행코드}
public class Calculator {

	// method
	// 리턴값 : X / 매개변수 : X
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	// 리턴값 : int type / 매개 변수 : int x, int y
	// 두 값을 더한 후 결과 리턴
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	// 리턴 값 : double type / 매개 변수 : int x, int y
	// 두 값을 나눈 후 결과 리턴
	double divide(int x, int y) {
		double result = (double)x / y;
		return result;
	}
	
	// 리턴 값 : X / 매개 변수 : X
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}