package chap06_class.sec06_packageAndAccessModifier.exam04_constructorAccessModifier.package1;

// 생성자 접근 제한 
// A.java와 동일한 패키지
public class B {

	// field
	A a1 = new A(true);		 // public 생성자 접근 가능
	A a2 = new A(1);		 // default 생성자 접근 가능
	// A a3 = new A("문자열)" -> ! private 생성자는 접근 불가
}