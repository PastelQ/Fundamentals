package chap09_nasted.sec01_nastedClassAndInterface.exam01_nastedClass;

// 중첩 클래스 : 클래스 내부에 선언된 클래스(두 클래스의 멤버들을 서로 쉽게 접근할 수 있고 외부엔 불필요한 관계 클래스를 감춤)
/** 바깥 클래스 **/
class A {
	// constructor
	A(){ System.out.println("A 객체가 생성됨"); }

	/** 멤버 클래스 - 인스턴스 클래스 **/
	class B{
		// constructor
		B(){ System.out.println("B 객체가 생성됨"); }
		
		// field
		int field1;
		// static int field2; -> 정적 필드 생성 X
		
		// method
		void method1() {}
		// static void method2(){} -> 정적 메서드 생성 X
	}
	
	/** 멤버 클래스 - 정적 클래스(static) **/
	static class C{
		// constructor
		C(){ System.out.println("C 객체가 생성됨"); }
		
		// field
		int field1;
		static int field2;
		
		// method 
		void method1() {};
		static void method2() {};
	}
	
	void method() {
		/** 로컬 메서드 **/
		class D{
			// constructor
			D() { System.out.println("D 객체가 생성됨"); }
			
			// field
			int field1;
			// static int field2; -> 정적 필드 생성 X
			
			// method
			void method1() {}
			// static void method2() {} -> 정적 메서드 생성 X
		}
		// 로컬메서드 D 인스턴스 생성(해당 메서드 내부에서만 사용 가능)
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
