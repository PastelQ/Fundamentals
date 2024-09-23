package chap08_interface.sec02_polymorphism.exam03_casting;

// Casting(강제 타입 변환) : 인터페이스를 구현하는 클래스에 선언된 멤버를 사용할 경우
// 강제 타입 변환을 하여 다시 구현 클래스 타입으로 변환 후에 구현 클래스의 필드, 메서드 사용

// 인터페이스
public interface Vehicle {
	// 추상 메서드
	public void run();
}