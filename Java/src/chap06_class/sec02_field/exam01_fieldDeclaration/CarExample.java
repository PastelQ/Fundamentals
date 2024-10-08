package chap06_class.sec02_field.exam01_fieldDeclaration;

// 외부 클래스에서 Car 필드값 읽기 및 변경
public class CarExample {

	public static void main(String[] args) {
		
		// 객체 생성
		Car myCar = new Car();
		
		// 필드값 읽기
		System.out.println("제작 회사:" + myCar.company);
		System.out.println("모델명:" + myCar.model);
		System.out.println("색상:" + myCar.color);
		System.out.println("최대 속도:" + myCar.maxSpeed);
		System.out.println("현재 속도:" + myCar.speed);
		
		// 필드값 변경
		myCar.speed = 60;
		System.out.println("변경 후 현재 속도:" + myCar.speed);
	}
}
