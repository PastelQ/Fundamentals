package chap06_class.sec03_constructor.exam03_constructorOverloading;

// 생성자 오버로딩 : 매개 변수를 달리하는 생성자를 여러 개 선언하는 것
// -> 매개 변수의 타입, 개수, 선언된 순서를 다르게 하여 다양한 방법으로 객체를 생성할 수 있음
public class Car {

	// * 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// * 생성자 오버로딩
	// 매개변수 X / 기본 생성자
	Car(){
	}
	
	// 매개변수 1개
	Car(String model){
		this.model = model;
	}
	
	// 매개변수 2개
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	// 매개변수 3개
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}