package chap07_inheritance.sec03_abstractClass.exam02_abstractMethod;

// Abstract Class Animal과 상속 받는 하위 클래스 관련 실행 클래스
public class AnimalExample {

	public static void main(String[] args) {
		
		// 하위 클래스 인스턴스 생성
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("--------------------"); // 구분선
		
		// 변수의 promotion(자동 타입 변환)
		Animal animal = null; 
		
		animal = new Dog();
		animal.sound(); // 자동 타입 변환 및 재정의된 메서드 호출
		
		animal = new Cat();
		animal.sound(); // 자동 타입 변환 및 재정의된 메서드 호출
		System.out.println("--------------------"); // 구분선
		
		// 메서드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	// 실행 클래스에서 사용될 재정의된 메서드를 호출하는 메서드
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}