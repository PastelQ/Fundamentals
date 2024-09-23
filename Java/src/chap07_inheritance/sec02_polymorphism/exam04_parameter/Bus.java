package chap07_inheritance.sec02_polymorphism.exam04_parameter;

// Vehicle 클래스를 상속 받는 하위 클래스
public class Bus extends Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}