package chap09_nasted.sec01_nastedClassAndInterface.exam02_AccessFieldAndMethod;

// 외부 필드와 메서드에서 사용 제한 
/** 바깥 클래스 **/
public class A {

	// 인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	// 인스턴스 메서드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// 정적 필드 초기화
	// static B field3 = new B();
	static C field4 = new C();
	
	// 정적 메서드
	static void method2() {
		// B var1 = new B();
		C var2 = new C();
	}
	
	/** 인스턴스 멤버 클래스**/
	class B{}
	
	/** 정적 멤버 클래스**/
	static class C{}
}

/**
인스턴스 멤버 클래스 : 
- 외부 클래스의 인스턴스 필드, 메서드에서 접근할 수 있음
- 외부 클래스의 정적 필드, 메서드에서 접근할 수 없음

정적 멤버 클래스 :
- 외부 클래스의 인스턴스/정적 필드,메서드에서 모두 접근 가능
**/