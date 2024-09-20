package chap06_class.sec03_constructor.finalTest;

// Member 객체 생성 / 생성자에서 name, id 필드를 외부에서 받은 값으로 초기화할 수 있도록
// Member 클래스 작성
public class Member {

	String name;
	String id;
	
	Member(String name,String id){
		this.name = name;
		this.id = id;
	}
}
// 예시 MemberExample
// Member user1 = new Member("홍길동", "hong");