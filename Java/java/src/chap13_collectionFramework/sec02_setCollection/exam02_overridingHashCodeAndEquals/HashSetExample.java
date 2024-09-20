package chap13_collectionFramework.sec02_setCollection.exam02_overridingHashCodeAndEquals;

import java.util.HashSet;
import java.util.Set;

// 사용자 정의 클래스 Member를 만들고 hashCode(),equals() 재정의
// > 인스턴스가 달라도 이름과 나이가 동일하다면 동일한 객체로 간주해 중복 저장되지 않게 되는 예시
public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		
		// 인스턴스는 다르나 내부 데이터가 동일해 객체 1개만 저장
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));
		
		System.out.println("총 객체 수 : " + set.size());
	}
}
