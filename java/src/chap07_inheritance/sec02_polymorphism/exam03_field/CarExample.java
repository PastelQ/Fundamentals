package chap07_inheritance.sec02_polymorphism.exam03_field;

// Tire, Car, HankookTire, KumhoTire를 이용하는 실행 클래스
public class CarExample {

	public static void main(String[] args) {
		// Car 인스턴스 생성
		Car car = new Car();
		
		//Car 객체의 run() 메서드 5회 반복
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
				
				case 1:
					System.out.println("앞 왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HanKookTire("앞 왼쪽", 15);
					break;
				case 2:
					System.out.println("앞 오른쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞 오른쪽", 13);
					break;
				case 3:
					System.out.println("뒤 왼쪽 HankookTire로 교체");
					car.backLeftTire = new HanKookTire("뒤 왼쪽", 14);
					break;
				case 4:
					System.out.println("뒤 오른쪽 KumhoTire로 교체");
					car.backRightTire = new KumhoTire("뒤 오른쪽", 17);
					break;
			}
			System.out.println("---------------------------"); // 1회전 시 구분선
		}
	}
}