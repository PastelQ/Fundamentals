package chap08_interface.sec01_interface.exam05_multipleImplementation;

import chap08_interface.sec01_interface.exam03_abstractMethod.RemoteControl;

// 다중 인터페이스 구현 클래스 : RemoteControl, Searchable 인터페이스의 추상메서드 모두 구현 필요
public class SmartTelevision implements RemoteControl, Searchable {

	// field
	private int volume;
	
	// method
	// RemoteControl Interface의 추상 메서드에 대한 실체 메서드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume) {
		// Interface 상수를 이용해 volume 필드 값 제한
		if(volume > RemoteControl.MAX_VOLUME) {			// 볼륨이 MAX보다 클 경우 상수 MAX(10) 설정
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) { // 볼륨이 MIN보다 작을 경우 상수 MIN(0) 설정
			this.volume = RemoteControl.MIN_VOLUME;
		} else {										// 그 외 매개변수 값을 필드에 대입
			this.volume = volume;						
		}
		System.out.println("현재 SmartTV 볼륨 : " + this.volume);
	}
	
	// Searchable Interface의 추상 메서드에 대한 실체 메서드
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
