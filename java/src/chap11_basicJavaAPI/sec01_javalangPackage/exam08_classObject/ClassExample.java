package chap11_basicJavaAPI.sec01_javalangPackage.exam08_classObject;

import chap06_class.sec02_field.exam01_fieldDeclaration.Car;

// java.lang.Class 클래스 
// JAVA는 클래스와 인터페이스의 MetaData를 java.lang 패키지에 소속된 Class 클래스로 관리
// MetaData : 클래스명, 생성자, 필드, 메서드 정보

/* 프로그램에서 Class 객체 얻는 3가지 방법
 1. Class clazz = 클래스명.class 		 				> 클래스로부터 얻는 방법
 2. Class clazz = Class.forName("패키지...클래스명")	> 클래스로부터 얻는 방법
 3. Class clazz = 참조변수.getClass(); 				> 객체로부터 얻는 방법 */

public class ClassExample {

	public static void main(String[] args) throws Exception{ // Exception 던지기(호출한 곳에서 처리)
		
		// 1. Class clazz = 클래스명.class(클래스로부터 얻는 방법)
		Class clazz = Car.class;
		
		// 2. Class clazz = Class.forName("패키지...클래스명")(클래스로부터 얻는 방법)
		// Class clazz = Class.forName("chap06_class.sec02_field.exam01_fieldDeclaration.Car");
		
		// 3. Class clazz = 참조변수.getClass();(객체로부터 얻는 방법)
		// Car car = new Car();
		// Class clazz = car.getClass();
		
		// 출력 방법
		System.out.println(clazz.getName());		// 클래스 전체 이름(패키지 포함)
		System.out.println(clazz.getSimpleName());	// 클래스 이름만
		System.out.println(clazz.getPackage().getName());		// 클래스 전체 이름(패키지 포함)
	}
}