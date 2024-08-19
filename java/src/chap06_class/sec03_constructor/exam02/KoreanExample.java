package chap06_class.sec03_constructor.exam02;

// 객체 생성 후 필드값 출력
public class KoreanExample {
	
	public static void main(String[] args) {
		
		// 매개변수 String n,s의 값을 넣어 생성자 호출 
		Korean k1 = new Korean("박자바", "123456-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김자바", "654321-1234567");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}
