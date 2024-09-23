package chap07_inheritance.sec01_inheritance.exam07_protectoed.package1;

// protected 접근 제한자의 경우 같은 패키지에서는 접근 가능함
public class B {
	
	// method
	public void method() {
		// 같은 패키지로 접근 가능
		A a = new A();	   // protected constructor 접근 가능
		a.field = "value"; // protected field 접근 가능 
		a.method(); 	   // protected method 접근 가능
	}
}