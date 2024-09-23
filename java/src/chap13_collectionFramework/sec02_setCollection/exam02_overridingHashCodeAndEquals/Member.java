package chap13_collectionFramework.sec02_setCollection.exam02_overridingHashCodeAndEquals;

public class Member {
	// Field
	public String name;
	public int age;
	
	// Constructor
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Method : equals()와 hashCode()를 재정의
	@Override
	public boolean equals(Object obj) {
		// name과 age가 값이 같다면 true 리턴
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// name과 age 값이 같으면 동일한 hashCode 리턴
		return name.hashCode() + age; // name(String) 해시코드와 age 값이 합쳐진 것이 해당 객체의 해시코드
	}
}