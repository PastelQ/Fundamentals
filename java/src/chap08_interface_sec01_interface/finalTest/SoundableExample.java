package chap08_interface_sec01_interface.finalTest;

// Soundable Interface를 구현하는 클래스를 사용하는 실행 클래스
public class SoundableExample {

	// Soundable Interface 타입 매개변수 -> 구현 클래스의 객체를 대입
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	// 실행 메인 메서드
	public static void main(String[] args) {
		
		printSound(new Cat());
		printSound(new Dog());
	}
}