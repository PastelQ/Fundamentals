package chap05_referenceType.sec03_enum.finalTest;

// LoginResult.enum을 사용하는 클래스
public class LoginResultExample {

	public static void main(String[] args) {
		
		LoginResult result = LoginResult.FAIL_PASSWORD;
		
		if(result == LoginResult.SUCCESS) {
			System.out.println("로그인 성공");
		} else if(result == LoginResult.FAIL_ID) {
			System.out.println("로그인 실패 - ID 불일치");
		} else {
			System.out.println("로그인 실패 - 패스워드 불일치");
		}
	}
}
