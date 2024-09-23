package chap08_interface.sec02_polymorphism.exam01_field;

// 다형성 : 구현 객체를 교체함으로써 프로그램의 실행 결과가 다양해지게 가능
// 필드의 다형성 : 필드 타입으로 타이어 인터페이스를 선언할 경우 필드값으로 구현 클래스를 대입할 수 있음
public interface Tire {
	
	// roll() 추상 메서드 선언 (구현 클래스는 해당 메서드를 필수로 구현 필요)
	public void roll();
}