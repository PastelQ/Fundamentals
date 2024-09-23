package chap09_nasted.sec02_anonymousObject.finalTest02;

/** 실행 클래스 **/
public class AnonymousExample {

	public static void main(String[] args) {
		
		// Anonymous 인스턴스 생성
		Anonymous anony = new Anonymous();
		
		// 익명 구현 객체가 대입된 필드에서 메서드 호출
		anony.field.run();
		
		// 익명 구현 객체가 로컬 변수에 대입된 메서드 호출
		anony.method1();
		
		// 인수로 익명 구현 객체 전달
		anony.method2(
				new Vehicle() {
					@Override
					public void run() {
						System.out.println("트럭이 달립니다.");
					}
				});
	}
}