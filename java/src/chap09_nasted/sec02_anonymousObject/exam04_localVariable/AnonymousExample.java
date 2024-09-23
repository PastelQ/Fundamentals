package chap09_nasted.sec02_anonymousObject.exam04_localVariable;

// 익명 객체의 로컬 변수 사용
/** 실행 클래스 **/
public class AnonymousExample {

	public static void main(String[] args) {
		// Anonymous 클래스 인스턴스 생성
		Anonymous anony = new Anonymous();
		
		anony.method(0, 0);
	}
}