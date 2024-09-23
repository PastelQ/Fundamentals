package chap08_interface.sec02_polymorphism.exam03_casting;

// 인터페이스 Vehicle과 구현 클래스 실행 클래스
public class VehicleExample {
	
	public static void main(String[] args) {
		
		// 인터페이스(타입) 변수명 = new 구현메서드();
		Vehicle vehicle = new Bus();
		
		// vehicle.checkFare(); -> checkFare()는 Bus(구현클래스)의 독자적인 메서드로 사용 X
		
		// 강제 타입 변환(casting)
		Bus bus = (Bus) vehicle;
		// casting 후 하기 메서드 모두 사용 가능
		bus.run();
		bus.checkFare();
	}
}