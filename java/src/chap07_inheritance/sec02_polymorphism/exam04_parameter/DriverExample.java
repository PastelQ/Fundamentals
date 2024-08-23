package chap07_inheritance.sec02_polymorphism.exam04_parameter;

// 매개변수의 다형성
// Vehicle, Bus, Taxi, Driver을 이용하는 실행 클래스
public class DriverExample {
	
	public static void main(String[] args) {
		
		// Driver 인스턴스 생성
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 자동 타입 변환 : drive()는 Vehicle 타입의 변수를 받으나 자식 클래스가 자동 변환
		driver.drive(bus);
		driver.drive(taxi);
	}
}