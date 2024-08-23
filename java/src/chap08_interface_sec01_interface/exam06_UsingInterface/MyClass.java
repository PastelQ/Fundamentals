package chap08_interface_sec01_interface.exam06_UsingInterface;

import chap08_interface_sec01_interface.exam03_abstractMethod.RemoteControl;
import chap08_interface_sec01_interface.exam04_implement.Audio;
import chap08_interface_sec01_interface.exam04_implement.Television;

// 인터페이스 사용 
// 클래스 선언 시 인터페이스는 "필드, 생성자(or메서드)의 매개변수, 로컬변수로 선언 가능
public class MyClass {
	
	// field : 인터페이스 타입 변수에 구현 클래스 인스턴스 대입
	RemoteControl rc = new Television();
	
	// constructor
	MyClass(){
	}
	
	MyClass(RemoteControl rc){ // 생성자 매개변수 타입을 인터페이스로 지정하여
		this.rc = rc;		   // 구현 클래스의 인자를 대입할 수 있음
		rc.turnOn();
		rc.turnOff();
	}
	
	// method
	void methodA() {
		RemoteControl rc = new Audio(); // 인터페이스 타입 변수에 구현 클래스 인스턴스를 생성해 대입
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) { // 메서드 매개변수 타입을 인터페이스로 지정
		rc.turnOn();				 // 구현 클래스의 인자 대입 가능
		rc.setVolume(5);
	}
}