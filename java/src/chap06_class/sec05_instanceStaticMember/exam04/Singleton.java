package chap06_class.sec05_instanceStaticMember.exam04;

// 싱글톤 : 하나의 객체(인스턴스)만 생성하도록 보장해야 할 때 단 하나만 생성된다고 해서 이 객체를 싱글톤이라고 부름
/* 싱글톤 생성하는 법 
 1. new 연산자로 생성자를 호출할 수 없도록 막아야 함
  -> 생성자 앞에 접근제한자 private를 붙여 외부에서 사용하지 못하게 진행
 2. 자신의 타입인 정적 필드를 하나 선언 
  -> 자신의 객체를 생성해 초기화
 3. 외부에서 호출할 수 있는 정적 메서드인 getInstance()를 선언하고 정적 필드에서 참조하고 있는 자신의 객체를 리턴
 */
public class Singleton {
	// 2. 자신의 타입인 정적 필드를 선언(자신의 타입 객체를 생성)
	private static Singleton singleton = new Singleton();
	
	// 1. 생성자 앞에 접근 제한자 private를 붙임
	private Singleton() {}
	
	// 3. 정적 메서드로 호출할 경우 2번에서 생성한 객체 반환
	static Singleton getInstance() {
		return singleton;
	}
}