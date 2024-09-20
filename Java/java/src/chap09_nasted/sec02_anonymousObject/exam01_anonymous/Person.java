package chap09_nasted.sec02_anonymousObject.exam01_anonymous;

// 익명 객체 생성(Anonymous Object) : 클래스 이름이 없는 객체
/* 문법
 부모클래스 [필드 | 변수] = new 부모클래스(매개값){
 // field  (필드, 메서드 모두 익명 객체 내부에서만 사용 가능(외부에서 접근 불가)
 // method (일반적으로 재정의 메서드 사용)
 }; */

/** 부모 클래스 **/
public class Person {

	void wake() {
		System.out.println("7시에 일어납니다.");
	}
}