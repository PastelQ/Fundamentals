package chap13_collectionFramework.sec01_listCollection.finalTest;

/** 게시물 클래스 **/
public class Board {

	// field
	private String title;	// 제목
	private String content; // 내용
	
	// constructor
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	// method (getMethod)
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
}