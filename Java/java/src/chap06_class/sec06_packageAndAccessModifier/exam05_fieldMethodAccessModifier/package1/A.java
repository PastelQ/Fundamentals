package chap06_class.sec06_packageAndAccessModifier.exam05_fieldMethodAccessModifier.package1;

// 필드와 메서드의 접근 제한
// 동일하게 public, protected, default, private
public class A {

	// field
	public int field1;	// public  field
	int field2;			// default field
	private int field3; // private field
	
	
	// constructor
	public A() {
		field1 = 1;		// public  field 접근 가능
		field2 = 1;		// default field 접근 가능
		field3 = 1;		// private field 접근 가능
		
		method1();		// public  method 접근 가능
		method2();		// default method 접근 가능
		method3();		// private method 접근 가능
	}
	
	
	// method
	public void method1() {}  // public  method
	void method2() {} 		  // default method
	private void method3() {} // private method
}