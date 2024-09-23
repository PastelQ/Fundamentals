package chap07_inheritance.sec01_inheritance.exam01_class;

// 상속 : 잘 개발된 상위 클래스를 하위 클래스에 재사용하여 중복되는 코드를 줄일 수 있는 기법 
// 부모 클래스에 해당
public class CellPhone {

	// field
	String model;
	String color;
	
	// constructor(기본 생성자)
	
	// method
	void powerOn() { System.out.println("전원을 켭니다."); }
	void powerOff() { System.out.println("전원을 끕니다."); }
	void bell() { System.out.println("벨이 울립니다."); }
	void sendVoice(String message) { System.out.println("자기 : " + message);	 }
	void receiveVoice(String message) { System.out.println("상대방 : " + message); }
	void hangUp() { System.out.println("전화를 끊습니다"); }
}