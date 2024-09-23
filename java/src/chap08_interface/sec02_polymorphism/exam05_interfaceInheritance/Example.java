package chap08_interface.sec02_polymorphism.exam05_interfaceInheritance;

// 구현 클래스 ImplementationC의 실행 클래스
public class Example {

	public static void main(String[] args) {
		
		ImplementationC impl = new ImplementationC();
		
		// InterfaceA(상위) 타입의 변수는 methodA()만 호출 가능
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		// InterfaceB(상위) 타입의 변수는 methodB()만 호출 가능
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		// InterfaceC(하위) 타입의 변수는 methodA,B,C 모두 호출 가능
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}