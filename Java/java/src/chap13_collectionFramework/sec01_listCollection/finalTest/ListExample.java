package chap13_collectionFramework.sec01_listCollection.finalTest;

import java.util.List;


/* 확인 문제 : BoardDao 객체의 getBoardList()를 호출하면 List<Board> 타입의 컬렉션을 리턴,
  ListExample 클래스를 실행할 때 예시의 결과와 같이 출력될 수 있도록 getBoardList() 작성 */
/** BoardDao 사용 클래스 **/
public class ListExample {

	public static void main(String[] args) {
		
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}