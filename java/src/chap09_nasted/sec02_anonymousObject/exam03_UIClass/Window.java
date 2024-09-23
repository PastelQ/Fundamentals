package chap09_nasted.sec02_anonymousObject.exam03_UIClass;

// UI 클래스
public class Window {
	
	// Button 클래스 인스턴스 생성
	Button button1 = new Button();
	Button button2 = new Button();
	
	// 필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	Window(){
		// 매개값으로 필드 대입
		button1.setOnClickListener(listener);
		// 매개값으로 익명 객체 대입
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}