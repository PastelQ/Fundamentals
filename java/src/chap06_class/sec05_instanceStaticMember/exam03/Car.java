package chap06_class.sec05_instanceStaticMember.exam03;

// 정적 메서드 선언 시 주의할 점 : 객체가 없어도 실행된다는 특징으로 내부에 인스턴스 필드, 인스턴스 메서드 사용X
// 사용이 필요하다면 객체(인스턴스)를 생성하여 그 후 인스턴스 멤버를 사용할 것
public class Car {
	// 필드
	int speed;
	// 메서드
	void run() {
		System.out.println(speed + "으로 달립니다");
	}
	
	// 실행 메서드(main method)가 static method이므로 예시로 진행
	public static void main(String[] args) {
		// 정적 메서드에서 인스턴스 멤버를 사용해야 하면 아래처럼 인스턴스 생성 후 사용
		Car car = new Car();
		car.speed = 60;	// 인스턴스 필드 사용
		car.run();		// 인스턴스 메서드 사용
	}
}