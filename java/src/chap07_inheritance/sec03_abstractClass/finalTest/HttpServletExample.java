package chap07_inheritance.sec03_abstractClass.finalTest;

// * HttpServlet(추상클래스)과 상속 받는 하위 클래스들 관련한 실행 클래스
// 해당 클래스를 실행하면 "로그인 합니다." , "파일 다운로드 합니다."가 차례대로 출력되도록
// LoginServlet과 FileDownloadServlet 클래스 선언하기
public class HttpServletExample {

	public static void main(String[] args) {
		
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}