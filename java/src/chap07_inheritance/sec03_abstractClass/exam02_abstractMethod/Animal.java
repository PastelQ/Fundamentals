package chap07_inheritance.sec03_abstractClass.exam02_abstractMethod;

// 추상 메서드(Abstract method) & 재정의(Overriding) 
// 실체 클래스의 멤버(필드, 메서드)를 통일하는 데 목적이 있다면 추상 클래스에 메서드 작성 권장
// 각 실체클래스마다 내용이 달라야 할 경우 Overriding을 통해 abstract method를 재정의하는 방법으로 진행
public abstract class Animal {

	// field
	public String kind;
	
	// method
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// abstract method : 중괄호({})블럭을 가질 수 없으며 선언만 진행한 후
	// 메서드를 상속받은 구체적인 하위 클래스에서 제공해야 함
	public abstract void sound();
}