package chap10_exception.sec01_exceptionClass.exam05_ClassCastException;

// ClassCastException : 강제 타입 변환(Casting)이 상위 클래스와 하위 클래스 간 혹은 구현 클래스와 인터페이스 관계가 아닐 경우
// * 해당 예외를 발생시키지 않으려면 타입 변환 전에 instanceof 연산자를 이용하여 검사하는 로직을 추가로 작성하는 것을 권장
public class ClassCastExceptionExample {
	
	/** 실행 메서드 **/
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);		
	}
	
	/** casting을 진행하는 메서드 **/
	public static void changeDog(Animal animal) {
		// If문을 이용하여 instanceof 사용하여 boolean 값을 평가
		if(animal instanceof Dog) {
			// casting (강제 타입 변환)
			Dog dog = (Dog) animal;
		} else {
			System.out.println("잘못된 Casting 입니다.");
		}
	}
}
class Animal{}				/** 부모 클래스 **/
class Dog extends Animal {} /** 자식 클래스 **/
class Cat extends Animal {} /** 자식 클래스 **/

/* 예외 발생 (changeDog()에서 instanceof 검사를 포함한 If문을 진행하지 않았을 때)
Exception in thread "main" java.lang.ClassCastException: class chap10_exception.sec01_exceptionClass.exam05_ClassCastException.Cat cannot be cast to class chap10_exception.sec01_exceptionClass.exam05_ClassCastException.Dog (chap10_exception.sec01_exceptionClass.exam05_ClassCastException.Cat and chap10_exception.sec01_exceptionClass.exam05_ClassCastException.Dog are in unnamed module of loader 'app')
	at chap10_exception.sec01_exceptionClass.exam05_ClassCastException.ClassCastExceptionExample.changeDog(ClassCastExceptionExample.java:22)
	at chap10_exception.sec01_exceptionClass.exam05_ClassCastException.ClassCastExceptionExample.main(ClassCastExceptionExample.java:14)
*/
