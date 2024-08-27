package chap11_basicJavaAPI.sec01_javalangPackage.exam01_equals;

// java.lang 패키지 : 자바 프로그램의 기본적인 클래스를 담고 있는 패키지
// -> java.lang 패키지의 클래스, 인터페이스는 import 없이 사용 가능(ex.System / String)
// Object 클래스 : 자바의 최상위 부모 클래스(java.lang.Object)

/* equals(Object obj) : 객체 동등 비교 메서드
 - Object 클래스의 메서드로 모든 객체가 매개값으로 대입할 수 있음 (== 와 같은 결과)
 - 두 객체가 동일한 메모리 같은 위치를 참조하는 지 확인
 
 * String의 경우 : String클래스에서 Overriding해 객체의 번지를 비교하지 않고 문자열 자체를 비교
 -  일반적으로 Object의 equals()는 직접 사용되지 않고 하위 클래스에서 재정의해 논리적으로 동등 비교할 때 이용됨
 논리적 동등 ? -> 같은 객체이건 다른 객체이건 상관 없이 객체가 저장하고 있는 데이터가 동일함(모양이 같음) */
public class Member {
	
	// field
	public String id;
	
	// constructor
	public Member(String id) {
		this.id = id;
	}
	
	// method : java.lang.Object의 equals()를 오버라이딩
	@Override
	public boolean equals(Object obj) {
		// equals() 재정의 시 파라미터가 Object로 모든 객체가 매개값으로 제공될 수 있어
		// 동일한 타입인지 제일 먼저 확인해야 함(instanceof)
		if(obj instanceof Member) {
			// Member 타입으로 강제 타입 변환
			Member member = (Member)obj; // Object 타입으로는 접근할 수 없는 Member 클래스의 특화된 필드 접근(다형성)
			if(id.equals(member.id)) {	 // id 필드값이 동일한 지 검사
				return true;
			}
		}
		return false;					 // 매개값이 Member타입이 아니거나, id 필드값이 다를 경우
	}
}