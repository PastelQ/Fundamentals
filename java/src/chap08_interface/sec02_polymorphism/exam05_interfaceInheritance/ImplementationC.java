package chap08_interface.sec02_polymorphism.exam05_interfaceInheritance;

// 하위 인터페이스인 InterfaceC의 구현 클래스
public class ImplementationC implements InterfaceC{

	// implements하고 있는 InterfaceC의 실체 메서드
	public void methodC() {
		System.out.println("ImplementationC - methodC() 실행");
	}
	
	// InterfaceC가 상속하는 상위 인터페이스A,B의 추상 메서드의 실체 메서드도 필요!
	public void methodB() {
		System.out.println("ImplementationC - methodB() 실행");
	}
	
	public void methodA() {
		System.out.println("ImplementationC - methodA() 실행");
	}
}