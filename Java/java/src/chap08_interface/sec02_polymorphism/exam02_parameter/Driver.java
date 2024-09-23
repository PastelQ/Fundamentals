package chap08_interface.sec02_polymorphism.exam02_parameter;

// Interface 매개변수의 다형성 : 
// 매개 변수의 타입이 인터페이스일 경우 구현 객체 어떤 것이라도 매개값으로 사용

public class Driver {

	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
