package chap09_nasted.sec01_nastedClassAndInterface.exam06_nestedInterface;

// 중첩 인터페이스 : 클래스의 멤버로 선언된 인터페이스 (해당 클래스와 관계를 맺는 구현 클래스 생성 목적)
/** 외부 클래스 **/
public class Button {
	
	// 인터페이스 타입 필드 선언
	OnClickListener listener;
	
	// 인터페이스 타입을 구현한 객체를 매개변수로 받는 Set메서드
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	// 구현 객체의 onClick() 메서드 호출
	void touch() {
		listener.onClick();
	}
	
	/** 중첩 인터페이스 (정적 멤버 인터페이스) **/
	static interface OnClickListener{
		void onClick();
	}
}
/* 중첩 인터페이스는 인스턴스 멤버 인터페이스와, 정적(static) 멤버 인터페이스 모두 가능
   -> 주로 정적 멤버 인터페이스를 많이 사용 (UI 프로그래밍에서 이벤트 처리 목적으로 많이 활용) */