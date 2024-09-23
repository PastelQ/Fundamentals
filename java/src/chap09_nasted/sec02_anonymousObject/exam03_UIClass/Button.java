package chap09_nasted.sec02_anonymousObject.exam03_UIClass;

// 윈도우나 안드로이드 등의 UI 프로그램에서 버튼의 클릭 이벤트를 처리하기 위해 
// 익명 구현 객체를 이용하는 예시

public class Button {

	// interface 타입 필드
	OnClickListener listener;
	
	// 구현 클래스의 인스턴스를 받는 Setter 메서드(매개변수의 다형성)
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	// 구현 객체의 onClick() 호출
	void touch() {
		listener.onClick();
	}
	
	// 중첩 인터페이스(정적 멤버 인터페이스)
	static interface OnClickListener{
		void onClick();
	}
}
