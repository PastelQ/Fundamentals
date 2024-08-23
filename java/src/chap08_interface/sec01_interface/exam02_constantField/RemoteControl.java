package chap08_interface.sec01_interface.exam02_constantField;

// 인터페이스 상수 필드 선언
// 인터페이스 : 객체 사용 방법을 정의한 것으로 실행 시 데이터를 저장할 수 있는 인스턴스, 정적필드 선언 불가
// 단 상수 필드(constant field)는 선언이 가능(public static final)
public interface RemoteControl {

	// 인터페이스에 선언된 필드는 모두 public static final(상수) 특성을 가짐
	// 생략하더라도 컴파일 시 묵시적으로 붙게 됨
	public int MAX_VOLUME = 10; // = public static final int MAX_VOLUME = 10; 
	public int MIN_VOLUME = 0;  // = public static final int MIN_VOLUME = 0;
}