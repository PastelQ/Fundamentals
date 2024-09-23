package chap08_interface.sec02_polymorphism.exam01_field;

// Tire 인터페이스를 사용하는 클래스
public class Car {

	// field
	// 인터페이스 타입 필드 선언 & 초기값 구현 객체를 대입
	Tire frontLeftTire = new HankookTire(); 
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	// method
	// 인터페이스에서 선언된 roll()메서드 호출
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}