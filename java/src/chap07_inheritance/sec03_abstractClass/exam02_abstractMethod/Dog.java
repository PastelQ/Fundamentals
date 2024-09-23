package chap07_inheritance.sec03_abstractClass.exam02_abstractMethod;

// abstract 클래스인 Animal을 상속 받는 하위 클래스
// abstract method를 구현하지 않으면 컴파일 에러 발생
// The type Dog must implement the inherited abstract method Animal.sound()
public class Dog extends Animal{
	
	// constructor
	public Dog() {
		this.kind = "포유류";
	}
	
	// abstract method Overriding
	public void sound() {
		System.out.println("멍멍");
	}
}