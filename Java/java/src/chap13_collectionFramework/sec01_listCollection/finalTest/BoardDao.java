package chap13_collectionFramework.sec01_listCollection.finalTest;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList(){
		// list<Board> 생성
		List<Board> list = new ArrayList();
		// list add
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
		// 해당 리스트 반환
		return list;
	}
}