package chap13_collectionFramework.sec03_mapCollection.exam02_overridingHashCodeAndEquals;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		// 학번, 이름이 동일한 student를 저장
		map.put(new Student(1,"홍길동"), 95);
		map.put(new Student(1,"홍길동"), 95);
		
		// 총 저장된 Map.Entry 수 얻기
		System.out.println("총 Entry 수 : " + map.size()); 
	}
}