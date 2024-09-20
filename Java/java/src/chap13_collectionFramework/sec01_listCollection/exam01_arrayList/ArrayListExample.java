package chap13_collectionFramework.sec01_listCollection.exam01_arrayList;

import java.util.ArrayList;
import java.util.List;

/* Collection Framework
 - 자바의 자료구조를 사용해 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 인터페이스와 구현 클래스를
  java.util 패키지에서 제공
 - 주요 인터페이스로는 List / Set / Map이 있으며 여러 구현 클래스를 가지고 있음 */
/* List 컬렉션
 - 배열과 비슷하게 객체를 인덱스로 관리
 - 차이점은 저장 용량이 자동으로 증가되며 객체를 저장할 때 자동 인덱스가 부여됨
 - 추가, 삭제, 검색을 위한 다양한 메서드들이 제공
 - List 컬렉션은 객체 자체를 저장하지 않고 객체의 번지를 참조하며 동일한 객체를 중복 저장 시 동일한 번지가 참조 */
/* ArrayList
 - List 인터페이스의 대표적인 구현 클래스
 - 기본생성자로 ArrayList를 생성하면 기본 10개의 객체를 저장할 수 있는 초기 용량을 가지며 자동으로 증가
 - 객체 추가 시 0번 인덱스부터 저장됨
 - 객체 삭제 시 바로 뒤 인덱스부터 마지막 인덱스까지 앞으로 1씩 당겨짐
  > 저장된 객체 수가 많고 특정 인덱스에 객체를 추가하거나 제거하는 일이 빈번하다면 ArrayList를 사용하는 게 바람직하지 않음 */
public class ArrayListExample {

	public static void main(String[] args) {
		
		// 다형성 : List 인터페이스를 구현한 ArrayList 클래스 인스턴스 생성
		// Generic(<타입>) : 해당 컬렉션에 저장되는 객체를 <타입>으로 지정하여 타입 안정성 높임
		List<String> list = new ArrayList<String>();
		
		// add() : 객체 추가
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 지정한 인덱스(2)에 객체 추가(원래 있던 객체는 뒤로 밀림)
		list.add("iBATIS");
		
		// size() : list 크기 얻기(저장된 총 객체 수 얻기)
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		// get() : 지정된 인덱스 객체 가져오기
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		// 저장된 총 객체 수만큼 루핑
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		// remove() : 지정된 인덱스 객체 삭제(바로 뒤부터 마지막 인덱스에 저장된 객체가 모두 당겨짐)
		list.remove(2); // "Database" 삭제
		list.remove(2); // 당겨진 "Servlet/JSP" 삭제
		list.remove("iBATIS"); // 객체로 삭제 가능(다만 동일한 객체가 있을 경우 첫번째로 검색된 것만 삭제)
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}
}