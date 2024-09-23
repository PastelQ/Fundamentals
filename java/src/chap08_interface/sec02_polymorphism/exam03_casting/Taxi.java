package chap08_interface.sec02_polymorphism.exam03_casting;

// Vehicle Interface를 구현하는 클래스
public class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	// Interface와 관계 없이 Bus 클래스에 선언된 독자적인 고유의 메서드 
	public void checkFare() {
		System.out.println("승차 요금을 체크합니다.");
	}
}
