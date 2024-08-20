package chap06_class.sec05_instanceStaticMember.exam05_final;

// final field Test
public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "usa"; -> 컴파일 에러(상수) : The final field Person.nation cannot be assigned
		// p1.ssn = "654321-7654321"; 
		p1.name = "홍삼원"; // final이 선언되지 않은 인스턴스 필드는 수정 가능
	}
}
