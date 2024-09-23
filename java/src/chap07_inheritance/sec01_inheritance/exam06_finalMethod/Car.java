package chap07_inheritance.sec01_inheritance.exam06_finalMethod;

// Final method : final 키워드를 붙인 method는 최종적인 메서드로 
// 재정의(Overriding)할 수 없는 메서드가 됨
public class Car {

	// field
	public int speed;
	
	// constructor (기본 생성자)
	
	// method
	public void speedUp() {
		speed += 1;
	}
	// final method
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}