package chap07_inheritance.sec02_polymorphism.exam03_field;

// 필드의 다형성 : 필드 타입을 부모 타입으로 선언할 경우 다양한 자식 객체들이 저장될 수 있어
// 필드 사용 결과가 달라질 수 있음

// 상위 클래스, 한국타이어와 금호타이어가 상속 받음
public class Tire {

	// field
	public int maxRotation;			// 최대 회전수(타이어 수명)
	public int accumulatedRotation; // 누적 회전수
	public String location;			// 타이어 위치
	
	// constructor
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// method
	public boolean roll() {
		++accumulatedRotation; // 누적 회전수 1씩 증가
		
		if(accumulatedRotation < maxRotation) {
			// 정상 회전(누적<최대)일 경우 실행
			System.out.println(location + " Tire 수명: "
					+ (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			// 펑크(누적=최대)일 경우 실행
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}
}