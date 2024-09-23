package chap06_class.sec06_packageAndAccessModifier.exam06_getterSetter;

// Getter & Setter Method 사용
public class CarExample {

	public static void main(String[] args) {
		
		// 생성자 호출하여 인스턴스 생성
		Car car = new Car();
		
		// 잘못된 속도 변경(인자(Argument)를 음수로)
		car.setSpeed(-50);
		System.out.println("현재 속도 : " + car.getSpeed());
		
		// 올바른 속도 변경
		car.setSpeed(60);
		System.out.println("현재 속도 : " + car.getSpeed());
		
		// 멈춤
		if(! car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println("현재 속도 : " + car.getSpeed());
	}
}