package chap08_interface.sec02_polymorphism.exam01_field;

// Tire 인터페이스와 구현 클래스들을 사용한 Car클래스의 실행 클래스
public class CarExample {
	
	public static void main(String[] args) {
		
		// Car 클래스의 인스턴스 생성
		Car car = new Car();
		
		// Tire인터페이스에 선언된 roll() 메서드 호출
		car.run();
		
		// car의 인터페이스 타입의 필드에 대입된 구현 객체 교체
		car.frontLeftTire = new KumhoTire();
		car.frontRightTire = new KumhoTire();
		
		car.run();
	}
}