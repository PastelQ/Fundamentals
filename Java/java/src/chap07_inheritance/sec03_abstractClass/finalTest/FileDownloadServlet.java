package chap07_inheritance.sec03_abstractClass.finalTest;

public class FileDownloadServlet extends HttpServlet {

	@Override
	public void service() {
		System.out.println("파일 다운로드합니다.");
	}
}