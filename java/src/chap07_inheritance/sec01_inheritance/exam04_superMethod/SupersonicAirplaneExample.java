package chap07_inheritance.sec01_inheritance.exam04_superMethod;

// super.부모클래스 메서드 
public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		// 자식 클래스 인스턴스 생성
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		
		sa.flyMode = SupersonicAirplane.SUPERSONIC; // SUPERSONIC 모드
		sa.fly();
		
		sa.flyMode = SupersonicAirplane.NORMAL;		// NORMAL 모드 
		sa.fly();									// 부모 클래스의 메서드 호출(super.메서드)
		
		sa.land();
	}
}
