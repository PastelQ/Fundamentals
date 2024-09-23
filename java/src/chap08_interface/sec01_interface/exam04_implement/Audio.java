package chap08_interface.sec01_interface.exam04_implement;

import chap08_interface.sec01_interface.exam03_abstractMethod.RemoteControl;

// 인터페이스 구현 : 인터페이스에서 정의된 추상 메서드와 동일한 메서드 이름, 매개변수, 리턴 타입을 가진
// 실체 메서드를 가지고 있어야 함
// 해당 객체를 인터페이스 implement 객체, 객체를 생성하는 클래스를 구현 클래스라고 함
public class Audio implements RemoteControl{
	
	// field
	private int volume;
	
	// method
	// turnOn() 추상 메서드의 실체 메서드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	// turnOff() 추상 메서드의 실체 메서드
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	// setVolume() 추상 메서드의 실체 메서드
	public void setVolume(int volume) {
		// Interface 상수를 이용해 volume 필드 값 제한
		if(volume > RemoteControl.MAX_VOLUME) {			// 볼륨이 MAX보다 클 경우 상수 MAX(10) 설정
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) { // 볼륨이 MIN보다 작을 경우 상수 MIN(0) 설정
			this.volume = RemoteControl.MIN_VOLUME;
		} else {										// 그 외 매개변수 값을 필드에 대입
			this.volume = volume;						
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
}
