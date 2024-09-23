package chap07_inheritance.sec02_polymorphism.exam03_field;

// Tire를 상속 받는 하위 클래스
public class KumhoTire extends Tire{

	// field
	// constructor
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KumhoTire 수명 : "
					+ (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}