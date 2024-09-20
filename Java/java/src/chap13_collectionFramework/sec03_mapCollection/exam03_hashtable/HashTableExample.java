package chap13_collectionFramework.sec03_mapCollection.exam03_hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/* Hashtable
 - Hashtable은 HashMap과 동일한 구조를 가지고 있음
  > Hashtable도 키로 사용될 객체는 hashCode(), equals()를 재정의 해 동등 객체 조건을 정해야 함
 * Hashtable / HashMap 차이점
 - Hashtable의 경우 동기화된 메서드(Synchronized method)로 구성되어 있어 멀티스레드가 동시에
  Hashtable의 메서드들을 실행할 수 없고, 하나의 스레드 실행을 완료한 후에만 다른 스레드 실행 가능
 - 멀티 스레드 환경에서 안전하게 객체 추가 삭제할 수 있음 (thread safe) */
/** 아이디 비밀번호 검사하기 **/
public class HashTableExample {

	public static void main(String[] args) {
		
		// 맵<String, String> 생성
		Map<String, String> map = new Hashtable<String,String>();
		
		// ID, 비밀번호를 미리 저장
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			String id = scanner.nextLine();
			
			System.out.print("비밀번호 : ");
			String password = scanner.nextLine();
			System.out.println();
			
			// containsKey(id)를 통해 키가 존재하는 지 확인
			if(map.containsKey(id)) {
				// 비밀번호 비교
				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다.");
					break;
				}
				else {
					System.out.println("비밀번호가 틀립니다.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}
}
