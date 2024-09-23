package chap09_nasted.sec02_anonymousObject.exam02_implementation;

// 익명 구현 객체 생성(인터페이스) : 
/* 문법
 인터페이스명 [필드|변수] = new 인터페이스명(){
 	// 인터페이스에 선언된 추상 메서드의 실체 메서드 선언
 	// field (field, method 추가로 선언 가능하나 구현된 메서드에서만 사용 가능하고 외부에서 사용 X)
 	// method
 };
*/

/** 인터페이스 **/
public interface RemoteControl {
	// 추상 메서드
	public void turnOn();
	public void turnOff();
}
