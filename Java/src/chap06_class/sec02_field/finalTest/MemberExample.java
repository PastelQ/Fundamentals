package chap06_class.sec02_field.finalTest;

// Member.java 클래스의 필드를 사용
public class MemberExample {
	
	public static void main(String[] args) {
		
		// 객체 생성
		Member member = new Member();
		
		member.name = "최하얀";
		member.age = 23;
		
		System.out.println("이름 : " + member.name);
		System.out.println("나이 : " + member.age);
	}
}