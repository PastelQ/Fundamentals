package chap06_class.sec05_instanceStaticMember.exam05_final;

// final 필드와 상수 : final 타입 필드 [=초기값]; > 프로그램 실행 중 수정할 수 없는 필드
/* final 필드 초기값 주는 2가지
 * 1. 필드 선언 시 주기
 * 2. 생성자에서 주는 방법 */
public class Person {
	
	// 필드 - final 포함
	final String nation = "Korea";
	final String ssn;
	String name;
	
	// 생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}