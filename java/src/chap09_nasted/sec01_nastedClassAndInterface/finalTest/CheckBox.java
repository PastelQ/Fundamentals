package chap09_nasted.sec01_nastedClassAndInterface.finalTest;

/* 확인 문제 : 중첩 인터페이스(OnSelectListener) 타입으로 필드를 선언하고 set 메서드로 외부에서
    		 구현 객체를 받아 필드에 대입하는데, 선택 이벤트가 발생했을 때 인터페이스를 통해 구현 객체의 메서드를 
    		 호출 할 수 있도록 구현 클래스 작성 */

/** 외부 클래스 **/
public class CheckBox {
	
	// 구현 인터페이스 타입 필드 선언
	OnSelectListener listener;
	
	// 매개 변수로 구현 클래스의 인스턴스를 받아 필드에 대입해주는 Setter 메서드
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	// 구현 객체의 onSelect 메서드
	void select() {
		listener.onSelect();
	}
	
	/** 정적 멤버 인터페이스 **/
	static interface OnSelectListener{
		void onSelect();
	}
}
