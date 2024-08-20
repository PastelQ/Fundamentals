package chap06_class.sec05_instanceStaticMember.exam01;

// 인스턴스 멤버와 this 사용 
public class CarExample {

	public static void main(String[] args) {
		
		// 생성자를 호출하여 인스턴스 생성
		Car car1 = new Car("포르쉐");
		Car car2 = new Car("벤츠");
		
		car1.run();
		car2.run();
	}
}