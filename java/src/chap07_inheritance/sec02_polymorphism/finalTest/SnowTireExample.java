package chap07_inheritance.sec02_polymorphism.finalTest;

// run()의 결과 확인하기 

// 실행 클래스
public class SnowTireExample {

	public static void main(String[] args) {
		
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; // Tire tire = new SnowTire();
		
		// 재정의된 run이 실행됨
		snowTire.run();	// SnowTire가 굴러갑니다.
		tire.run();		// SnowTire가 굴러갑니다.
	}
}