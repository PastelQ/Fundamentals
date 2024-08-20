package chap06_class.sec04_method.finalTest01;

/* 메서드 호출 연습
 - login(), logout() 메서드 선언하기
 1. login() : 매개값 id, password
 2. logout(): 매개값 id */
public class MemberService {

	boolean login(String id, String password) {
		return true;
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
