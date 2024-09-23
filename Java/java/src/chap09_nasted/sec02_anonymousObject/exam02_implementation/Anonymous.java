package chap09_nasted.sec02_anonymousObject.exam02_implementation;

// 익명 구현 객체 생성
public class Anonymous {

	/** field 초기값으로 대입 **/
	RemoteControl field = new RemoteControl() {
		// 추상 메서드 구현
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	void method1() {
		/** 로컬 변수 값으로 대입 **/
		RemoteControl localVar = new RemoteControl() {
			// 추상 메서드 구현
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		// 대입한 로컬 변수 사용
		localVar.turnOn();
	}
	
	// 익명 객체 매개값으로 사용하기 위해 인터페이스 타입 매개변수 설정(구현 클래스가 다형성으로 들어올 예정)
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
