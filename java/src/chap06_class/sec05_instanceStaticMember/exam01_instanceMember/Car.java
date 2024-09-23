package chap06_class.sec05_instanceStaticMember.exam01_instanceMember;

// 인스턴스 멤버와 this
/* 인스턴스 멤버 : 객체(인스턴스)를 생성한 후 사용할 수 있는 필드, 메서드
  ? 메서드 또한 필드(인스턴스 멤버)가 사용될 수 있어서 인스턴스 멤버에 포함됨 */
public class Car {

	// 필드
	String model;
	int speed;
	
	// 생성자
	Car(String model){
		this.model = model;
	}
	
	// 메서드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			// this.model -> 객체 내부에서도 인스턴스 멤버에 접근하기 위해 this 사용 가능
			// 객체 자신을 뜻함
			System.out.println(this.model + "가 달립니다.(시속 : " + this.speed + "km/h)");
		}
	}
}