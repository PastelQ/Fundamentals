package chap08_interface_sec01_interface.exam06_UsingInterface;

import chap08_interface_sec01_interface.exam04_implement.Audio;
import chap08_interface_sec01_interface.exam04_implement.Television;

// 인터페이스 사용 
// 클래스 선언 시 인터페이스는 "필드, 생성자(or메서드)의 매개변수, 로컬변수로 선언 가능

// RemoteControl 인터페이스와 구현한 클래스들의 실행 클래스 
public class MyClassExample {

	public static void main(String[] args) {
		
		System.out.println("1)-----------------");
		
		// 필드에 구현 클래스인 Television 대입하여 
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();		// Television에서 구현한 메서드
		myClass1.rc.setVolume(5);	// Television에서 구현한 메서드
		
		
		System.out.println("2)-----------------");
		
		// 인터페이스 타입 매개변수를 받는 생성자 호출 시 구현 클래스 인스턴스를 인자로 전달
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3)-----------------");
		
		// methodA는 인터페이스 타입 변수에 구현 클래스 Audio 인스턴스를 생성 및 해당 변수를 호출
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)-----------------");
		
		// methodB는 인터페이스 타입 파라미터를 받는데 구현 클래스 인스턴스를 인자로 전달
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}
}