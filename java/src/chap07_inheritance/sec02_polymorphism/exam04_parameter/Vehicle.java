package chap07_inheritance.sec02_polymorphism.exam04_parameter;

// 매개 변수의 다형성 : 매개값을 다양화하기 위해 매개 변수에 자식 객체를 지정
// promotion(자동 타입 변환)은 필드 값 대입할 때에도 발생하나, 주로 메서드 호출 시 많이 발생

// 부모 클래스
public class Vehicle {

	public void run() {
		System.out.println("차량이 달립니다.");
	}
}