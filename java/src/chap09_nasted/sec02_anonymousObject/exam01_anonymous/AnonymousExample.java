package chap09_nasted.sec02_anonymousObject.exam01_anonymous;

/** 익명 객체 생성 실행 클래스 **/
public class AnonymousExample {

	public static void main(String[] args) {
		
		// Anonymous 클래스 인스턴스 생성
		Anonymous anony = new Anonymous();
		
		// 1. 익명 객체 필드 사용
		anony.field.wake();
		
		// 2. 익명 객체 로컬 변수에 대입한 부분 사용
		anony.method1();
		
		// 3. 익명 객체 매개값 사용
		anony.method2(// 인수에 하기 익명 객체 생성
				new Person() {
					void study() {
						System.out.println("공부합니다.");
					}
					
					@Override
					void wake() {
						System.out.println("8시에 일어납니다");
						study();
					}
				});
	}
}
