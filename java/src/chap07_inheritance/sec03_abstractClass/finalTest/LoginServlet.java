package chap07_inheritance.sec03_abstractClass.finalTest;

public class LoginServlet extends HttpServlet {

	@Override
	public void service() {
		System.out.println("로그인 합니다.");
	}
}