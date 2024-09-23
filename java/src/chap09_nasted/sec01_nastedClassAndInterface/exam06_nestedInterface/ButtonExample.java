package chap09_nasted.sec01_nastedClassAndInterface.exam06_nestedInterface;

// 버튼 이벤트를 처리하는 실행 클래스
public class ButtonExample {

	public static void main(String[] args) {
		// 외부 클래스 인스턴스 생성
		Button btn = new Button();
		
		// 각 구현 클래스를 아규먼트로 보냄(다형성)
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}
/* 인스턴스 멤버 인터페이스? 
 해당 패키지는 정적 멤버 인터페이스로 구현하는 클래스가 외부 클래스의 인스턴스와 무관하게 사용함(implements 명시 시)
 다만 인스턴스 멤버 인터페이스일 경우 외부 클래스의 인스턴스가 필요하여
 외부 클래스 인스턴스를 생성한 후 그걸 통해 접근이 진행해야 함
 
 ex) OnClickListener가 인스턴스 멤버 인터페이스라면?
 * ButtonExample(실행클래스 예시)
 
 public class ButtonExample{ 
 	// 생성자를 통해 외부 클래스의 인스턴스를 매개변수로 받음
 	public static void main(String[] args){
 		
 		// 외부 클래스 인스턴스 생성
 		Button btn = new Button();
 		
 		// 익명 클래스를 사용해 인터페이스의 인스턴스를 생성 
 		// -> 인스턴스 멤버 인터페이스를 사용할때는 변수 btn이 아닌 클래스명으로 접근
 		Button.OnClickListener inter = new Button.OnClickListener(){
	 		@Override
	 		public void onClick(){
	 			System.out.println("전화를 겁니다.");
 		}
 		
 		btn.setOnClickListener(inter);
 		btn.touch();
 }
 */