package chap07_inheritance.sec01_inheritance.exam04_superMethod;

// Airplane을 상속 받는 하위 클래스
public class SupersonicAirplane extends Airplane{

	// field
	public static final int NORMAL = 1; 	// 상수
	public static final int SUPERSONIC = 2; // 상수
	
	public int flyMode = NORMAL; // 상위 상수를 필드값으로 갖는 필드
	
	// constructor(기본 생성자)
	
	// method
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly(); // 부모 클래스인 Airplane 객체의 fly() 호출
		}
	}
	
}
