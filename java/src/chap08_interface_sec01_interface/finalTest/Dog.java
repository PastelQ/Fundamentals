package chap08_interface_sec01_interface.finalTest;

// Soundable 인터페이스 구현 클래스
public class Dog implements Soundable{

	@Override
	public String sound() {
		return "멍멍";
	}
}
