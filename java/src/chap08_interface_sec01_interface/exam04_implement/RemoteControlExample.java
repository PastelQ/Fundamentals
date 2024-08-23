package chap08_interface_sec01_interface.exam04_implement;

import chap08_interface_sec01_interface.exam03_abstractMethod.RemoteControl;

// RemoteControl 인터페이스를 구현한 클래스 관련하여 실행 클래스
// 인터페이스 타입 변수에 구현 객체 대입 
public class RemoteControlExample {

	public static void main(String[] args) {
		
		// RemoteControl 타입 변수 rc 선언 후 구현 객체 대입
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
	}
}