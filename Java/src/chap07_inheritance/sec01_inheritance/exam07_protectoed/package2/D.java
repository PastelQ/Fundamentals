package chap07_inheritance.sec01_inheritance.exam07_protectoed.package2;

import chap07_inheritance.sec01_inheritance.exam07_protectoed.package1.A;

// protected 접근제한자의 경우 다른 패키지라도 상속을 받는 관계라면 접근이 가능
// A클래스를 상속 받는 하위 클래스
public class D extends A{
	
	// constructor : protected 접근 제한자 접근 시도
	public D() {
		super();			  // super()로 상위클래스 생성자 접근
		this.field = "value"; // field 접근 가능
		this.method();		  // method 접근 가능
	}
}