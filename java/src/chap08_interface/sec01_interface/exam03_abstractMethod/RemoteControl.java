package chap08_interface.sec01_interface.exam03_abstractMethod;

// 추상 메서드 선언 
// 인터페이스를 통해 호출된 메서드는 최종적으로 객체에서 실행
// -> 인터페이스의 메서드는 실행 블록이 필요 없는 추상 메서드로 선언
// [public abstract(생략해도 묵시적으로 붙음)](리턴 타입, 메서드 이름, 매개 변수);
public interface RemoteControl {

	// field : constant(public static final)
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// constructor X : 인터페이스는 객체로 생성할 수 없어 생성자를 가질 수 없음 
	
	// method : abstract(public abstract)
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}