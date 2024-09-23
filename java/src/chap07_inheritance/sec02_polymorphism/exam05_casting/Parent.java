package chap07_inheritance.sec02_polymorphism.exam05_casting;

// casting(강제 타입 변환) : 부모 타입을 자식 타입으로 변환
// 자식 -> 부모 타입으로 자동 타입 변환 시 부모 클래스에 선언된 필드와 메서드만 사용 제약이 있으나
// 자식에 선언된 필드, 메서드를 사용해야 할 경우 강제타입변화를 통해 다시 자식 타입으로 변환 후 사용이 가능

// 부모 클래스
public class Parent {

	// field
	public String field1;
	
	// method
	public void method1() {
		System.out.println("Parent-method1()");
	}
	
	public void method2() {
		System.out.println("Parent-method2()");
	}
}