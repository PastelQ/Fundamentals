package chap09_nasted.sec02_anonymousObject.finalTest01;

public class Anonymous {
	
	// 필드 값으로 대입
	Worker field = new Worker() {
		@Override
		public void start() {
			System.out.println("디자인을 합니다.");
		}
	};
	
	void method1() {
		// 익명 객체 로컬 변수에 대입
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("개발을 합니다.");
			}
		};
		localVar.start(); // 메서드 호출
	}
	
	// 매개 변수를 구현 클래스를 받아 해당 익명 객체에 정의된 start() 메서드 호출
	void method2(Worker worker) {
		worker.start();
	}
}
