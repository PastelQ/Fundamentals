package chap06_class.sec03_constructor.exam04;

// 다른 생성자 호출해서 중복 코드 줄이기 ( this() 사용 )
public class Car {
	
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car(){
	}
	
	// 다른 생성자 호출
	Car(String model){
		this(model, "은색", 250);
	}
	
	// 다른 생성자 호출
	Car(String model, String color){
		this(model, color, 250);
	}
	
	// 생성자 초기화 코드
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
