package chap09_nasted.sec02_anonymousObject.finalTest02;

public class Anonymous {
	
	// 필드로 익명 구현 객체 대입
	Vehicle field = new Vehicle() {
		// 구현 메서드
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
	void method1() {
		// 메서드의 로컬 변수에 익명 구현 객체 대입
		Vehicle localVar = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
	}
	
	// 매개 변수로 Vehicle의 구현 인스턴스를 받음
	void method2(Vehicle vehicle) {
		vehicle.run(); // 구현체의 run() 호출
	}
}