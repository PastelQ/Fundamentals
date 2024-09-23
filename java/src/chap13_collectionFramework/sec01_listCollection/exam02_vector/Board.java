package chap13_collectionFramework.sec01_listCollection.exam02_vector;

/** VectorExample에서 사용되는 객체 타입 **/
public class Board {
	
	// Field
	String subject;
	String content;
	String writer;
	
	// Constructor
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}