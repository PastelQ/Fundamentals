package chap11_basicJavaAPI.sec01_javalangPackage.exam01_objectClassEquals;

/** 실행 클래스 **/
public class MemberExample {

	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		// obj1 과 obj2 비교
		if(obj1.equals(obj2)) { // 매개값이 Member 타입이고 id 필드값도 동일하므로 true
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		// obj1 과 obj3 비교
		if(obj1.equals(obj3)) { // 매개값은 Member 타입이나, id 필드값이 불일치하여 false
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
	}
}