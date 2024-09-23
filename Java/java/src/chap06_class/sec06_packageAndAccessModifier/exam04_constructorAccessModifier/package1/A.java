package chap06_class.sec06_packageAndAccessModifier.exam04_constructorAccessModifier.package1;

// 생성자의 접근 제한
// public, protected, default, private 동일
public class A {
	
	// field
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");

	// constructor (Overloading)
	public A(boolean b) {} // public
	A(int b) {}			   // default
	private A(String s) {} // private
}