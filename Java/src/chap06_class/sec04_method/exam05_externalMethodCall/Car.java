package chap06_class.sec04_method.exam05_externalMethodCall;

// 객체 외부에서 호출
public class Car {

	// field
	int speed;
	
	// constructor (명시 X 기본 생성자)
	
	// method
	int getSpeed() {
		return speed;
	}
	
	void keyTurn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속:" + speed + "km/h)");
		}
	}
}