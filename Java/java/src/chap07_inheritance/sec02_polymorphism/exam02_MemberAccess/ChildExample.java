package chap07_inheritance.sec02_polymorphism.exam02_MemberAccess;

// 자동 타입 변환 후의 멤버 접근
// ! 부모 타입으로 자동 변환된 이후엔 부모클래스에 선언된 필드와 메서드만 접근이 가능

// 실행 클래스
public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		// promotion(자동 타입 변환)
		Parent parent = child;
		
		parent.method1();	// Parent의 method1 호출
		parent.method2();	// Overriding된 method2 호출
		//parent.method3();
	}
}