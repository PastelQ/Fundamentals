package chap07_inheritance.sec01_inheritance.exam02_super;

// 부모 생성자 호출 : super()
// 상위 클래스의 생성자가 기본 생성자일 경우 하위 클래스에서는 super()를 컴파일러가 생성
// 자식 생성자를 선언 후 명시적으로 부모 생성자를 호출해야 한다면 super(매개값1, ... 매개값n) 생성
public class People {

	// field
	public String name;
	public String ssn;
	
	// constructor 
	// 부모 객체에서 기본 생성자가 아닌 매개변수가 2개인 생성자 선언
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}