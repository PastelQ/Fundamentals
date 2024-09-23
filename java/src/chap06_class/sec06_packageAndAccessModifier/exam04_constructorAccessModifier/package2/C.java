package chap06_class.sec06_packageAndAccessModifier.exam04_constructorAccessModifier.package2;
// A.java 클래스 임포트
import chap06_class.sec06_packageAndAccessModifier.exam04_constructorAccessModifier.package1.A;

// 생성자 접근 제한
// A.java와 패키지가 다른 상황
public class C {

	A a1 = new A(true);			// public 생성자 접근 가능
	// A a2 = new A(1);			// default, private 생성자 접근 불가
	// A a3 = new A("문자열");
}