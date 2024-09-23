package chap08_interface.sec02_polymorphism.exam04_instanceof;

import chap08_interface.sec02_polymorphism.exam03_casting.Taxi;
import chap08_interface.sec02_polymorphism.exam03_casting.Bus;

// Vehicle Interface와 구현 객체를 사용하는 Driver 클래스의 실행 클래스
public class DriverExample {

	public static void main(String[] args) {
		
		// Driver 클래스 인스턴스 생성
		Driver driver = new Driver();
		// 구현 클래스들의 인스턴스 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// Vehicle 인터페이스 타입의 매개변수에 구현 클래스들의 인스턴스를 인자로 대입
		driver.drive(bus);
		driver.drive(taxi); // instaceof를 사용한 if문에서 bus객체가 아니기 때문에 checkFare() 호출되지 않음
	}
}