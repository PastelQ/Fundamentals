package chap09_nasted.sec01_nastedClassAndInterface.exam03_memberClassAccess;

// 멤버 클래스에서 사용 제한

/** 외부 클래스 **/
public class A {

	// 외부 클래스의 인스턴스 멤버
	int field1;
	void method1() {}
	// 외부 클래스의 정적 멤버
	static int field2;
	static void method2() {}
	
	/** 인스턴스 멤버 클래스 **/
	class B{
		void method() {
			// 모든 필드와 메서드에 접근 가능
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	/** 정적 멤버 클래스 **/
	static class C{
		void method() {
			// 인스턴스 필드와 메서드는 접근 불가
			// field1 = 10;
			// method1();
			
			// 정적 필드, 메서드는 접근 가능
			field2 = 10;
			method2();
		}
	}
}
