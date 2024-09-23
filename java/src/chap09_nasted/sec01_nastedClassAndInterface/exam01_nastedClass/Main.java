package chap09_nasted.sec01_nastedClassAndInterface.exam01_nastedClass;

// 중첩 클래스 객체 생성해보기

/** 실행 클래스 **/
public class Main {
	
	public static void main(String[] args) {
		
		// 바깥 클래스 인스턴스 생성
		A a = new A();
		
		// 인스턴스 멤버 클래스 객체 생성
		// 바깥 클래스의 인스턴스 먼저 생성 후 .(도트연산자)를 통해 인스턴스 멤버 클래스 인스턴스 생성
		A.B b = a.new B(); 
		b.field1 = 3;
		b.method1();
		
		// 정적 멤버 클래스 객체 생성
		// 바깥 클래스의 인스턴스 필요 없이 .(도트연산자)를 통해 아래와 같이 접근이 가능
		A.C c = new A.C();
		c.field1 = 3;	 // 인스턴스 필드
		c.method1();	 // 인스턴스 메서드
		A.C.field2 = 3;	 // 정적 필드
		A.C.method2();	 // 정적 메서드
		
		// 로컬 클래스(D) 객체 생성을 위한 메서드 호출
		a.method();
	}
}
