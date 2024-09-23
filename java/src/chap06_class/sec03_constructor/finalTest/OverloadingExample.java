package chap06_class.sec03_constructor.finalTest;

// Overloading.java 클래스 객체를 생성하는 네가지 방법
public class OverloadingExample {
	
	public static void main(String[] args) {
		
		// 매개 변수 2개
		Overloading o1 = new Overloading("Mobydick", "I can java");
		
		// 매개 변수 3개
		Overloading o2 = new Overloading("Mobydick", "I can java", "pastelq");
		
		// 매개 변수 4개
		Overloading o3 = new Overloading("Mobydick", "I can java", "pastelq", "21:06");
		
		// 매개 변수 5개
		Overloading o4 = new Overloading("Mobydick", "I can java", "pastelq", "21:06", 100);
		
	}
}
