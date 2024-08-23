package chap07_inheritance.sec02_polymorphism.exam03_field;

// Tire를 상속 받는 하위 클래스
public class HanKookTire extends Tire{

	// field
	// constructor
	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// method
	@Override
	public boolean roll() {	// roll()메서드를 재정의 (출력 내용을 HankookTire로 수정)
		++accumulatedRotation;
		
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " HankookTire 수명 : "
					+ (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
