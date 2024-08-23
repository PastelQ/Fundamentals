package chap07_inheritance.sec03_abstractClass.exam01_abstract;

// abstract class Phone을 상속 받는 클래스
// 별도 abstract method는 없기 때문에 강제되는 메서드는 없음
public class SmartPhone extends Phone{

	// constructor
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// method
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}