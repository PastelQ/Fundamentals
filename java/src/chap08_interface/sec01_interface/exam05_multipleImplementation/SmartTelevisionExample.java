package chap08_interface.sec01_interface.exam05_multipleImplementation;

import chap08_interface.sec01_interface.exam03_abstractMethod.RemoteControl;

// 다중 인터페이스를 구현한 클래스의 실행 클래스
public class SmartTelevisionExample {

	public static void main(String[] args) {
		
		// 다중 인터페이스 구현 클래스의 인스턴스 생성
		SmartTelevision tv = new SmartTelevision();
		
		// 각 인터페이스 타입 변수 선언 및 구현 객체 대입
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}
}