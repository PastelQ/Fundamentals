package chap11_basicJavaAPI.sec01_javalangPackage.exam02_hashCode;

// 객체 해시코드(hashCode()) : 객체를 식별하는 하나의 정수값
// 객체의 메모리 번지를 이용해 해시코드를 만들어 리턴하기 때문에 객체마다 다른 값을 가지고 있음
/* 컬렉션프레임워크에서 HashSet / MashMap / Hashtable은 하기와 같은 방법으로 객체가 동등한 지 비교
 1. hashCode()를 실행해 리턴된 해시코드 값이 같은 지 확인
 2. 해시코드 값이 다를 경우 다른 객체로 판단
 3. 해시코드 값이 같으면 equals()로 다시 비교
 즉, hashCode() 메서드가 true여도 equals()의 리턴값이 다르면 다른 객체가 됨 */

// 결론적으로 객체의 동등 비교를 위해선 Object의 equals()메서드만 재정의하지 말고 
// hashCode()도 재정의 해 논리적으로 동등한 객체일 경우 동일한 해시코드가 리턴되도록 해야함
public class Key {

	// field
	public int number;
	
	//constructor
	public Key(int number) {
		this.number = number;
	}
	
	// method 
	// equals() 오버라이드
	@Override
	public boolean equals(Object obj) {
		// Key 인스턴스인지 확인
		if(obj instanceof Key) {
			// Key 타입으로 캐스팅하여 Key의 필드 접근(다형성)
			Key compareKey = (Key)obj;
			// 필드값이 같은 지 확인
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	// hashCode() 오버라이드
	@Override
	public int hashCode() {
		return number;
	}
}