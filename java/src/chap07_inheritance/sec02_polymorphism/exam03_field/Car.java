package chap07_inheritance.sec02_polymorphism.exam03_field;

// Tire를 부품으로 가지는 클래스(Tire와 상속 관계는 아님)
public class Car {
	
	// field
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽",4);
	
	// constructor(기본 생성자)
	
	// method
	// 각 Tire 객체의 roll()를 호출하여 1회씩 회전
	int run() {
		System.out.println("[자동차가 달립니다.]");
		// false를 리턴하는 roll() 타이어일 경우 stop() 메서드 및 해당 타이어 번호 리턴
		if(frontLeftTire.roll()==false) { stop(); return 1; }
		if(frontRightTire.roll()==false) { stop(); return 2; }
		if(backLeftTire.roll()==false) { stop(); return 3; }
		if(backRightTire.roll()==false) { stop(); return 4; }
		return 0;
	}
	// 펑크 시 실행
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}