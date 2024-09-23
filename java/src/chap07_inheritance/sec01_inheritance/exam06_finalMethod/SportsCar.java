package chap07_inheritance.sec01_inheritance.exam06_finalMethod;

// 재정의(Overriding)할 수 없는 final 메서드
// Car 클래스를 상속 받는 하위 클래스
public class SportsCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// 컴파일 에러 : Cannot override the final method from Car
	// @Override	
	// public void stop() {}
}