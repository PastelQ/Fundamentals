package chap11_basicJavaAPI.sec01_javalangPackage.exam03_exam01AddExam02;


public class Member {
	
	//field
	public String id;
	
	// constructor
	public Member(String id) {
		this.id = id;
	}
	
	// method : equals(), hashCode() 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			// String에서 재정의한 equals() = 문자열 비교
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	// id가 동일한 문자열인 경우 같은 
	@Override
	public int hashCode() {
		// String에서 재정의한 hashCode() = 같은 문자열일 경우 동일한 해시코드 반환
		return id.hashCode();
	}
}
