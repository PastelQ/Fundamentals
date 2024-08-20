package chap06_class.sec04_method.finalTest01;

// MemeberService.java 객체를 생성하여 메서드 호출 연습
public class MemberServiceExample {

	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("ID 또는 Password가 올바르지 않습니다.");
		}
		
	}
	
}
