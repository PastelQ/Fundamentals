package chap06_class.sec03_constructor.finalTest;

// Board 클래스의 생성자가 오버로딩되어 있을 때, 중복 코딩된 부분 제거
// this() 사용
public class Overloading {

	// Field
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	// Constructor (Overloading)
	Overloading(String title, String content){
		this(title, content, "로그인한 회원 아이디", "현재 컴퓨터 날짜", 0);
	}
	
	Overloading(String title, String content, String writer){
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
	}
	
	Overloading(String title, String content, String writer, String date){
		this(title, content, writer, date, 0);
	}
	
	// 초기화 코드(공통 실행 코드)
	Overloading(String title, String content, String writer, String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
}
