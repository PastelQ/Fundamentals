package chap09_nasted.sec02_anonymousObject.exam02_implementation;

// 익명 구현 객체 생성 
/** 실행 클래스 **/
public class AnonymousExample {

	public static void main(String[] args) {
		// Anonymous 클래스 인스턴스 생성
		Anonymous anony = new Anonymous();
		
		// 1. 익명 객체 필드 사용
		anony.field.turnOn();
		
		// 2. 익명 객체 로컬 변수 사용
		anony.method1();
		
		// 3. 익명 객체 매개값 사용
		anony.method2(
				new RemoteControl() {
					// 추상 메서드 구현
					@Override
					public void turnOn() {
						System.out.println("SmartTV를 켭니다.");
					}
					
					@Override
					public void turnOff() {
						System.out.println("SmartTV를 끕니다.");
					}
				});
		
	}
}
