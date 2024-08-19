package chap06_class.sec03_constructor.exam01;

// 생성자를 호출하여 객체 생성
public class CarExample {

	public static void main(String[] args) {
		
		// 매개변수로 String color, int cc를 받아야 하므로 값 전달
		Car myCar = new Car("검정", 3000);
		// Car myCar = newCar(); -> 생성자가 명시되어 있으므로 기본 생성자는 현재 호출 X
	}
}