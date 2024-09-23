package chap07_inheritance.sec02_polymorphism.exam02_MemberAccess;

// 자동 타입 변환 후에 멤버 접근
// 자식 클래스
public class Child extends Parent{

	// Overriding(재정의)
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}