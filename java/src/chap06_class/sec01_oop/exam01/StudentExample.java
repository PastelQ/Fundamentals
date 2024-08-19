package chap06_class.sec01_oop.exam01;

// oop : 객체지향프로그램 -> 속성(필드), 동작(메서드)로 이루어진 객체를 조립하여 완성된 프로그램을 만드는 기법
// Student.java에서 Student 객체를 생성
public class StudentExample {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		// Student 클래스는 하나이나 new 연산자로 생성된 각각의 인스턴스는 자신만의 고유 데이터를 가지면서
		// 메모리에서 활동하게 됨. (즉, s1과 s2가 참조하는 Student 객체는 독립된 서로 다른 객체)
	}
}