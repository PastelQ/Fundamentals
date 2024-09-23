package chap06_class.sec04_method.exam03_return;

// return문 알아보기 : Car.java의 메서드 호출
public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		// setGas 메서드 호출 (가스 5로 설정)
		car.setGas(5);
		
		// isLeftGas() 메서드 호출 (상태를 gasState 변수 저장)
		boolean gasState = car.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다.");
			// run() 메서드 호출 (가스 1개씩 소모)
			car.run();
		}
		
		// car의 isLeftGas() 호출
		if(car.isLeftGas()) {
			System.out.println("Gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("Gas를 주입하세요.");
		}
	}
}