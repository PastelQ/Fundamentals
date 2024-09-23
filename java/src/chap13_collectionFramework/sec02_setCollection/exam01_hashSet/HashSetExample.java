package chap13_collectionFramework.sec02_setCollection.exam01_hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set 컬렉션
 - 저장 순서가 유지되지 않으며, 객체를 중복해서 저장할 수 없음(null도 하나만 저장 가능)
 - 인덱스에 저장되지 않아 인덱스로 객체를 검색해 가져오는 메서드가 없음
 * Iterator(반복자)
 - 전체 객체를 대상으로 한 번씩 반복해 가져오는 반복자 제공
 - Iterator 인터페이스를 구현한 객체로 iterator()를 호출하면 얻을 수 있음
 Next() : Iterator에서 하나의 객체를 가져올 때 사용
 hasNext() : next()를 사용하기 전 먼저 가져올 객체가 있는 지 확인하는 부분을 권장
  가져올 객체가 있을 경우 true 리턴 */
/* HashSet
 - 객체들을 순서 없이 저장, 중복 저장하지 않음
 - 해당 판단에서 동일한 객체란 꼭 같은 인스턴스가 아닌 객체를 저장하기 전 먼저 객체의
  hashCode()를 호출해 이미 저장되어 있는 객체들의 HashCode와 비교 
 - 그 후 equals()로 두 객체를 비교해 true가 나오면 동일한 객체로 판단하고 중복 저장하지 않음 */

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		// add() : 저장
		set.add("Java");
		set.add("Java"); // "Java"는 한 번만 저장됨(중복 저장 X)
		set.add("Servlet/JSP");
		set.add("JDBC"); 
		set.add("iBatis"); 
		
		// size() : 저장된 객체 수 얻기
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		// Iterator(반복자) 얻기
		Iterator<String> iterator = set.iterator(); // iterator() 호출
		while(iterator.hasNext()) { // 다음 객체가 있는 지 확인
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		// remove() : 객체 삭제
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("총 객체 수 : " + set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		// clear() : 모든 객체 제거하고 비움
		set.clear();
		// isEmpty() : 컬렉션이 비어있다면 true 반환
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}