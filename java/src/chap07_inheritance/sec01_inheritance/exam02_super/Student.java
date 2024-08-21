package chap07_inheritance.sec01_inheritance.exam02_super;

// People를 상속 받는 하위 클래스
public class Student extends People{
	
	// field
	public int studentNo;
	
	// constructor
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	// 상위 클래스 생성자가 매개변수 2개를 받는 것으로 선언
		this.studentNo = studentNo;
	}
	// super()를 명시하지 않을 경우 하기 컴파일 에러 발생
	// Implicit super constructor People() is undefined. Must explicitly invoke another constructor
	// 부모 클래스의 기본 생성자가 없어서 다른 생성자를 명시적으로 호출할 것 
}