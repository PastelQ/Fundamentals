package chap09_nasted.sec02_anonymousObject.finalTest03;

/* 확인 문제 : CheckBox 클래스엔 중첩 인터페이스(정적 멤버 인터페이스)타입으로 필드(listener)를 선언하고
  Setter 메서드로 외부에서 구현 객체를 받아 필드에 대입.
  선택 이벤트가 발생했을 때 인터페이스를 통해 구현 객체의 메서드를 호출한다고 할 때,
  "배경을 변경합니다" 가 출력되도록 익명 구현 객체 작성 */

/** 외부 클래스 **/
public class CheckBox {
	// 인터페이스 타입 필드 선언
	OnSelectListener listener;
	
	// Setter 메서드(구현 클래스의 인스턴스를 받아 필드 Set)
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	// 선택 이벤트 메서드
	void select() {
		listener.onSelect();
	}
	
	/** 정적 멤버 인터페이스 **/
	static interface OnSelectListener{
		void onSelect();
	}
}