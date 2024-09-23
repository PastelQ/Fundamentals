package chap13_collectionFramework.sec01_listCollection.exam03_linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* LinkedList
 - ArrayList와 사용 방법은 동일하나 내부 구조가 다름
 1. ArrayList : 내부 배열에 객체를 저장해서 관리
 2. LinkedList : 인접 참조를 링크하여 체인 같이 관리
 - 특정 인덱스 객체를 제거 시 앞 뒤 링크만 변경되고 나머지 링크는 변경되지 않음
  > ArrayList는 중간 인덱스 제거 시 뒤에 있는 객체 인덱스가 당겨지기 때문에 
   빈번한 객체 삽입, 삭제가 일어나는 곳에선 LinkedList가 더 좋은 성능을 발휘 */
/** ArrayList / LinkedList 실행 성능 비교 **/
public class LinkedListExample {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();  // ArrayList
		List<String> list2 = new LinkedList<String>(); // LinkedList
		
		long startTime;
		long endTime;
		
		// ArrayList 인덱스 0에 10000개의 데이터 삽입하는 데 걸리는 시간 nanoTime으로 측정
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 소요 시간 : " + (endTime-startTime) + " ns");
		
		
		// LinkedList 인덱스 0에 10000개의 데이터 삽입하는 데 걸리는 시간 nanoTime으로 측정
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요 시간 : " + (endTime-startTime) + " ns");
	}
}