package chap08_interface.sec02_polymorphism.exam04_instanceof;

import chap08_interface.sec02_polymorphism.exam03_casting.Bus;
import chap08_interface.sec02_polymorphism.exam03_casting.Vehicle;

// instanceof 연산자(어떤 객체인지 확인)
// casting(강제 타입 변환)의 경우 구현 객체가 인터페이스 타입으로 변환되어 있는 상태에서 가능
// ClassCastException 발생을 방지하기 위해 검사 진행 후 안전하게 casting 진행 필요

// Vehicle 인터페이스와 구현 객체를 사용하는 클래스
public class Driver {
	// Vehicle interface 타입으로 vehicle에는 구현 객체가 대입됨
	public void drive(Vehicle vehicle) {
		
		if(vehicle instanceof Bus) { // vehicle 매개 변수가 참조하는 객체가 Bus인지 조사
			Bus bus = (Bus)vehicle;  // Bus객체일 경우 -> casting
			bus.checkFare();		 // Bus의 고유 메서드 호출 가능
		}
		
		vehicle.run();
	}
}