package chap08_interface.sec01_interface.exam01_declaration;

// Interface : 객체의 사용 방법을 정의한 타입 (다중 상속)
// 하나의 객체가 아닌 여러 객체들과 사용이 가능하여 어떤 객체를 사용하느냐에 따라 실행 내용, 리턴값이 달라짐
public interface RemoteControl {

	// 인터페이스는 상수필드, 추상 메서드만을 구성 멤버로 가짐. 객체로 생성할 수 없어 생성자 X
	
	// 상수
	// 타입 상수이름 = 값;
	
	// 추상 메서드 -> 중괄호 블럭 X
	// 타입 메서드이름(매개변수1, 매개변수2 ... 매개변수n);
}