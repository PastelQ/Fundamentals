package chap07_inheritance.sec01_inheritance.exam04_superMethod;

// 부모 메서드 호출
// 자식 클래스의 메서드를 Overriding할 경우 부모 클래스의 메서드는 숨겨지나
// 부모 클래스의 메서드가 필요할 경우 super 키워드를 붙여 호출이 가능
public class Airplane {

	// method
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반 비행입니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}