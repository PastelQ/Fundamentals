package chap06_class.sec04_method.exam05_externalMethodCall;

// 클래스 외부에서 메서드 호출
public class CarExample {
		
	public static void main(String[] args) {
		
		// 생성자로 객체 생성
		Car car = new Car();
		
		car.keyTurn();	// 메서드 호출
		car.run();		// 메서드 호출
		
		int speed = car.getSpeed();	// 변수에 getSpeed()로 Car.java의 필드값 speed을 담음
		System.out.println("현재 속도 : (" + speed + "km/h)");
	}
}
