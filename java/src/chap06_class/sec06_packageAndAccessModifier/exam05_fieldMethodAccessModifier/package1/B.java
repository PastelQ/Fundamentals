package chap06_class.sec06_packageAndAccessModifier.exam05_fieldMethodAccessModifier.package1;

// 필드와 메서드의 접근 제한
// A.java와 동일한 패키지 다른 클래스
public class B {
	
	// constructor 선언에서 A 인스턴스 생성 및 각 접근제한자 별 필드, 메서드 접근 여부 확인
	public B() {
		A a = new A();		// public  class 접근 가능
		
		a.field1 = 1;		// public  field 접근 가능
		a.field2 = 1;		// default field 접근 가능
		// a.field3 = 1;	!! private field 접근 불가 ! : The field A.field3 is not visible
		
		a.method1();		// public  method 접근 가능
		a.method2();		// default method 접근 가능
		// a.method3();		!! private method 접근 불가 ! : The method method3() from the type A is not visible
	}
}