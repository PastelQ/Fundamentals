package chap14_IOStream.chap02_filterStream.exam06_objectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 객체 입출력 보조 스트림(ObjectIn/OutputStream)
 - 메모리에 생성된 객체를 파일 혹은 네트워크로 출력
 - ObjectOutputStream : 객체를 직렬화(객체 -> Byte[] 만들기)
 - ObjectInputStream : 객체를 역질렬화(Byte[] -> 객체 복원)
  > 입력스트림에서 읽은 바이트를 역직렬화하여 객체로 다시 복원하는데,
   리턴 타입이 Object 타입으로 원래 타입으로 casting 해야 함
 * Java는 모든 객체를 직렬화하지 않음
 - java.io.Serializable 인터페이스를 구현한 객체만 직렬화(메서드 선언이 없는 인터페이스)
 - 네트워크로 전송할 목적이라면 개발자는 클래스를 선언할 때 Serializable을 추가
  > 개발자가 JVM에게 직렬화해도 좋다고 승인하는 역할 */
/** 객체 입출력 보조 스트림 **/
public class ObjectStreamExample {
	
	/** 실행 클래스 **/
	public static void main(String[] args) throws Exception{
		writeList(); 				   // List를 파일에 저장
		List<Board> list = readList(); // 파일에 저장된 List 읽기
		
		// Date 객체 양식 맞춰줄 sdf
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// List 내용을 모니터에 출력
		for(Board board : list) {
			System.out.println(
				board.getBno() + "\t" + board.getTitle() + "\t" + 
				board.getContent() + "\t" + board.getWriter() + "\t" +
				sdf.format(board.getDate())
			);
		}
	}
	
	/** 출력 writeList() **/
	public static void writeList() throws Exception{
		// Board 객체를 담을 ArrayList 생성
		List<Board> list = new ArrayList<>();
		// list에 Board 객체 저장
		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(1, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(1, "제목3", "내용3", "글쓴이3", new Date()));
		
		// 해당 경로로 출력하는 Byte 기반 스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/icanjava/StudyWorkSpace/javaIO/board.db");
		// 객체 출력 보조 스트림을 이용하여 list 출력
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		oos.flush(); // 버퍼 내부의 잔류 데이터 전부 내보내기
		oos.close(); // 출력 스트림 자원 해제
	}
	
	/** 입력 readList() **/
	public static List<Board> readList() throws Exception{
		// 해당 경로를 출발지로 하는 Byte 기반 입력 스트림 생성
		FileInputStream fis = new FileInputStream("C:/icanjava/StudyWorkSpace/javaIO/board.db");
		// 객체 입력 보조 스트림을 이용하여 list 읽기
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// readObject()를 통해 읽은 list를 <Board> List에 받아 리턴
		List<Board> list = (List<Board>)ois.readObject(); // readObject() 리턴타입은 Object로 캐스팅
		return list;
	}
}