package chap08_interface.sec02_polymorphism.exam05_interfaceInheritance;

// 하위 인터페이스 (InterfaceA, B를 상속 받는다 - 다중 상속 가능)
public interface InterfaceC extends InterfaceA, InterfaceB{
	// method
	public void methodC();
}