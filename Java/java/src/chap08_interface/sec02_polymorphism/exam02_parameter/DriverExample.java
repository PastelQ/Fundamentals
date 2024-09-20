package chap08_interface.sec02_polymorphism.exam02_parameter;

// 매개 변수의 다형성 테스트
// Vehicle 인터페이스를 구현한 클래스를 사용하는 Driver의 실행 클래스
public class DriverExample {

	public static void main(String[] args) {
		
		// Driver 클래스 인스턴스 생성
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// drive()는 매개변수 타입이 Vehicle 인터페이스로 구현 클래스 인스턴스를 인자로 전달
		driver.drive(bus);	// promotion -> Vehicle vehicle = bus;
		driver.drive(taxi); // promotion -> Vehicle vehicle = taxi;
	}
}