package chap07_inheritance.sec03_abstractClass.exam01_abstract;

// abstract class : 공통적인 기능을 정의, 구체화하도록 강제하기 위해 사용
// 직접 인스턴스화할 수 없고, 최소 하나 이상의 추상 메서드를 포함할 수 있음
public abstract class Phone {

	// 실체 클래스에서 사용될 공통되는 필드, 메서드를 따로 선언함
	// field
	public String owner;
	
	// constructor
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// method
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}