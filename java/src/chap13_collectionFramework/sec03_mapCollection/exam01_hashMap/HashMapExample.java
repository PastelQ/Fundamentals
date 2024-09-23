package chap13_collectionFramework.sec03_mapCollection.exam01_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* Map 컬렉션
 - 키(key)와 값(Value)로 구성된 Map.Entry 객체를 저장하는 구조(Entry는 Map인터페이스 내부에 선언된 중첩 인터페이스)
 - 키는 중복 저장 X / 값은 중복 저장 가능 : 저장된 키와 동일한 키로 저장하면 덮어씌워짐 */
/* HashMap
 - Map 인터페이스를 구현한 대표적인 Map 컬렉션
 - 해당 키로 사용될 객체는 hashCode() / equals()로 내부와 동등한 객체인지 비교 */
public class HashMapExample {

	public static void main(String[] args) {
		
		// HashMap 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		// put(K,V) : 객체 저장 / size() : 저장된 총 Entry 수 얻기
		map.put("신용권", 85);
		map.put("홍길동", 90); // 삭제
		map.put("동장군", 80);
		map.put("홍길동", 95); // "홍길동" 키가 같아 마지막 값으로 저장
		System.out.println("총 Entry 수 : " + map.size());
		
		// get(K) : 객체 찾기(Key로 Value 찾기)
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		
		// 1. 객체를 하나씩 처리(ketSet() 활용)
		Set<String> keySet = map.keySet();    // keySet()로 모든 키를 Set 컬렉션에 담음
		
		// 반복자를 이용해 키를 얻고 값을 Map에서 얻어냄 
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); // 키 하나씩 뽑기
			Integer value = map.get(key);	 // 해당 키로 값 찾기
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		
		// remove(K) : 객체 삭제 (키로 Map.Entry 제거)
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		
		// 2. 객체를 하나씩 처리(entrySet() 활용)
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.Entry Set 얻기
		
		// 반복자를 이용해 Map.Entry를 얻고 키, 값을 얻어냄
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			// getKey() 키 얻기
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		
		// 객체 전체 삭제
		map.clear(); // 모든 Map.Entry 삭제
		
		System.out.println("총 Entry 수 : " + map.size());
	}
}
