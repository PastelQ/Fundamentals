package chap07_inheritance.sec03_abstractClass.exam01_abstract;

// Phone, SmartPhone의 실행 클래스
public class PhoneExample {

	public static void main(String[] args) {
		
		//Phone phone = new Phone(); -> abstract class는 직접 인스턴스화할 수 없음
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		// turnOn, turnOff는 Phone에게 상속 받은 메서드
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}