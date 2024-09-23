package chap09_nasted.sec02_anonymousObject.exam03_UIClass;

// 윈도우 및 안드로이드 등의 UI 프로그램에서 버튼 클릭 이벤트를 처리하기 위해 익명 구현 객체를 이용한 모습
/** 실행 클래스 **/
public class Main {

	public static void main(String[] args) {
		
		// 윈도우 클래스 인스턴스 생성
		Window w = new Window();
		
		w.button1.touch();
		w.button2.touch();
	}
}
