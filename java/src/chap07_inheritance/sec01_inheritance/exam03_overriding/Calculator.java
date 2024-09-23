package chap07_inheritance.sec01_inheritance.exam03_overriding;

// Overriding (메서드 재정의) : 상속 받은 부모 클래스의 메서드를 다시 정의
// 1. 부모의 메서드와 동일한 시그니처(리턴타입, 메소드 이름, 매개 변수 목록)을 가져옴
// 2. 접근 제한을 더 강하게 재정의할 수 없음(예시 : 부모 public / 자식 default 수정 불가)
// 3. 새로운 예외(Exception)을 throws할 수 없음
public class Calculator {

	// method
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}