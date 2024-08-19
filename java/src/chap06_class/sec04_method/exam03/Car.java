package chap06_class.sec04_method.exam03;

// return문 자세히 알아보기
// 주의 : return문 이후의 실행문은 Unreachable code 라는 컴파일 에러와 함께 실행 X
public class Car {

	// field
	int gas;
	
	// constructor
	// 없음 (기본 생성자)
	
	// method
	// 리턴값이 없는 메서드, 매개값을 받아 필드값 조정(gas)
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// 리턴값 boolean -> true / false 반환
	boolean isLeftGas() {
		// gas가 0일 경우 false, 그외 true를 반환
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	// 리턴값이 없는 메서드
	void run() {
		while(true) {
			// gas가 0보다 클 경우 -=1 하여 gas를 소모하는 메서드
			if(gas>0) {
				System.out.println("달립니다.(gas 잔량 :" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas 잔량 :" + gas + ")");
				return; // 메서드 실행 종료(return으로 강제 종료)
			}
		}
	}
}