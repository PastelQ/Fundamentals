package chap14_IOStream.sec02_filterStream.exam06_objectStream;

import java.io.Serializable;
import java.util.Date;

// Serializable 인터페이스 구현 객체(Java는 해당 인터페이스를 구현한 객체만 직렬화)
/** ObjectStreamExample에서 사용할 Board 객체 **/
public class Board implements Serializable{
	// Field
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;
	
	// Constructor
	public Board(int bno, String title, String content, String writer, Date date) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}
	// Method (Getter & Setter)
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
