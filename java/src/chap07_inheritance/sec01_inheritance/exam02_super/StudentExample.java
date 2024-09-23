package chap07_inheritance.sec01_inheritance.exam02_super;

// 자식 객체 이용(상속, super)
public class StudentExample {

	public static void main(String[] args) {
		
		// 자식 클래스 생성자 호출하여 인스턴스 생성
		Student student = new Student("홍길동", "123456-1234567", 1);
		
		System.out.println("name : " + student.name);	// 상속 받은 필드
		System.out.println("ssn : " + student.ssn);		// 상속 받은 필드
		System.out.println("studentNo : " + student.studentNo);
	}
}