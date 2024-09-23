package chap07_inheritance.sec02_polymorphism.exam01_promotion;

// promotion : 자동 타입 변환
// 클래스 단위에서 타입 변환은 상속 관계가 있는 클래스 사이에서 발생
// 자식은 부모 타입으로 자동 변환이 가능

// 가장 상위 클래스
class A {}

// A 클래스를 상속 받는 하위 클래스 B와 C
class B extends A{}
class C extends A{}

// B를 상속 받는 D / C를 상속 받는 E
class D extends B{}
class E extends C{}

public class PromotionExample {

	public static void main(String[] args) {
		
		// 각 클래스 인스턴스 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 자식은 부모 타입으로 자동 타입 변환 가능
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		// 각각 상속 받는 관계라면 자동 타입 변환
		B b1 = d;
		C c1 = e;
		
		// 상속 관계에 있지 않아 컴파일 에러 발생
		// B b3 = e;
		// C c2 = d;
	}
}