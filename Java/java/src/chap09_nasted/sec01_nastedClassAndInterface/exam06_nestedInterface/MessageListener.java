package chap09_nasted.sec01_nastedClassAndInterface.exam06_nestedInterface;

// 중첩 인터페이스(정적 멤버 인터페이스)를 구현하는 클래스 
// implements 외부클래스명.정적 멤버 인터페이스명 
public class MessageListener implements Button.OnClickListener{ 
	
	// 인터페이스에 선언된 추상 메서드 구현
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다");
	}
}