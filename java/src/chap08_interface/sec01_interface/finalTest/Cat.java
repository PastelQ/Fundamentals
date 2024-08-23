package chap08_interface.sec01_interface.finalTest;

// Soundable 인터페이스 구현 클래스
public class Cat implements Soundable{

	@Override
	public String sound() {
		return "야옹";
	}
}
