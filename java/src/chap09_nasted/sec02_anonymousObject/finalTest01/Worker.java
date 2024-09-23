package chap09_nasted.sec02_anonymousObject.finalTest01;

/* 확인 문제 : AnonymousExample 클래스 실행결과를 확인 후 
 			Worker 클래스의 익명 자식 객체를 이용하여 필드, 로컬 변수의 초기값, 메서드의 매개값을 대입 */
/** 부모 클래스 **/
public class Worker {

	public void start() {
		System.out.println("쉬고 있습니다.");
	}
}