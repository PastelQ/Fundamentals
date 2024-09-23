package chap08_interface.sec02_polymorphism.exam05_interfaceInheritance;

// 인터페이스 상속 : 인터페이스는 다른 인터페이스를 상속할 수 있는데(다중 상속도 가능),
// 하위 인터페이스를 구현하는 클래스는 그 상위 인터페이스의 추상 메서드를 모두 구현(실체 메서드)해야함
// + 하위 인터페이스로 타입 변환될 경우 상위 및 하위 인터페이스에 선언된 모든 메서드 사용 가능
// 단, 상위 인터페이스로 타입 변환될 경우 하위의 인터페이스 메서드는 사용 불가

// 상위 인터페이스
public interface InterfaceA {
	// method
	public void methodA();
}