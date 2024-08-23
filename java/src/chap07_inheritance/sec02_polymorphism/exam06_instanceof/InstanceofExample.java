package chap07_inheritance.sec02_polymorphism.exam06_instanceof;

// instanceof 연산자 
// Ex) boolean result = 좌향(객체) instanceof 우향(타입)
// 메서드 내 강제 타입 변환이 필요할 경우 매개값이 어떤 객체인 지 instanceof 연산자로 확인 후
// 안전하게 강제 타입 변환 진행이 필요함
public class InstanceofExample {

	public static void method1(Parent parent) {
		// Child 타입으로 변환이 가능한 지 확인
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	// instanceof 연산자 사용 X
	public static void method2(Parent parent) {
		// ClassCastException 발생 가능성 있음
		Child child = (Child)parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	// 실행 메서드 
	public static void main(String[] args) {
		
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		// parentB는 처음부터 부모 타입으로 생성된 객체
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB); // ClassCastException 발생
		// 예외가 발생되면 프로그램은 즉시 종료되어 method1()과 같이 변환시킬 타입의 객체인지 조사하여
		// 프로그램 종료를 막아야 함
	}
}