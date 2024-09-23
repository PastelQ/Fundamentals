package chap06_class.sec03_constructor.exam01_constructorDeclaration;

// 생성자 선언
// 생성자 : new 연산자로 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당
// 객체 초기화 : 필드를 초기화하거나 메서드를 호출해서 객체를 사용할 준비
// new 연산자로 성공적으로 생성자가 실행될 경우 힙 영역에 객체가 생성되고 객체의 번지 리턴
public class Car {
	
	// 주의 : 클래스에 생성자가 명시적으로 선언되어 있을 경우에는 선언된 생성자를 호출하여 객체 생성이 필요
	// 명시되어 있을 경우에 기본 생성자(매개변수 X)를 사용하려면 이것도 명시해야 함
	Car(String color, int cc){ // 현재 생성자는 String 1개, int 1개의 매개변수로 제공 받아야 호출 가능
	}
}