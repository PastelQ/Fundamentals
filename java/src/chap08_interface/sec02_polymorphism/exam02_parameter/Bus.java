package chap08_interface.sec02_polymorphism.exam02_parameter;

// Vehicle 인터페이스를 구현하는 구현 클래스
public class Bus implements Vehicle{

	// Vehicle의 추상 메서드의 구현 메서드
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
