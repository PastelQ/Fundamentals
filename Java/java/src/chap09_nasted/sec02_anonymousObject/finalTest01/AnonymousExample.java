package chap09_nasted.sec02_anonymousObject.finalTest01;

/** 실행 클래스 **/
public class AnonymousExample {

	public static void main(String[] args) {
		
		// Anonymous 클래스 인스턴스 생성
		Anonymous anony = new Anonymous();
		
		// 필드 대입된 익명 객체의 메서드 start() 호출
		anony.field.start();
		// 익명 객체가 로컬 변수에 저장된 메서드 호출
		anony.method1();
		// 인수로 익명 객체 대입
		anony.method2(
				new Worker() {
					@Override
					public void start() {
						System.out.println("테스트를 합니다.");
					}
				});
	}
}
