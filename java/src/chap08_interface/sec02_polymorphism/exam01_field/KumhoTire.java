package chap08_interface.sec02_polymorphism.exam01_field;

// Tire Interface를 구현하는 구현 클래스
public class KumhoTire implements Tire{

	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}