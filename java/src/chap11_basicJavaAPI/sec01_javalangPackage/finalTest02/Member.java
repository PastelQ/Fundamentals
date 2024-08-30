package chap11_basicJavaAPI.sec01_javalangPackage.finalTest02;

// Member 클래스를 작성하되 Object의 toString()을재 정의해 MemberExample 클래스의
// 실행 결과가 'blue : 이파란'이 출력되도록 하기
public class Member {

	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		String memberField = id + " : " + name;
		return memberField;
	}
}