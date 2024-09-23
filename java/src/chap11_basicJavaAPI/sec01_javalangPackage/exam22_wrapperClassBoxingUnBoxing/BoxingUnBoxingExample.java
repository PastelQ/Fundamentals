package chap11_basicJavaAPI.sec01_javalangPackage.exam22_wrapperClassBoxingUnBoxing;

// Wrapper 클래스 : 기본 데이터 타입을 객체로 변환하거나 객체에서 기본 데이터 타입으로 변환할 때 Wrapper 클래스를 사용
/* java.lang 패키지의 클래스로 기본 타입의 값을 내부에 두고 포장(기본 타입의 값을 갖는 객체) 포장 객체를 관리
 - 포장 객체의 특징 : 포장하고 있는 기본 타입 값은 외부에서 변경 불가하여 변경이 필요할 경우 새로운 포장 객체를 생성
 - 기본 타입에 대응되는 클래스 들 중 int와 char타입의 경우 각각 Integer, Character로 변경되는 것 외엔
  모두 기본타입의 첫 문자를 대문자로 바꾼 이름을 가지고 있음
 
 Boxing   : 기본 타입의 값을 포장 객체로 만드는 과정 2가지
  - 1. 포장객체 참조변수 = new 포장객체(기본타입 값)     // 생성자 이용
  - 2. 포장객체 참조변수 = 포장객체.valueOf(기본타입 값) // 각 포장 클래스마다 가지고 있는 정적 valueOf() 이용
  
 Unboxing : 포장 객체에서 기본 타입 값을 얻어내는 과정(수정은 불가)
  - 기본타입 변수명 = 박싱참조변수.기본타입+Value() */

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		// Boxing : 포장객체 참조변수 = new 포장객체(기본타입 값) / 포장객체.valueOf(기본타입 값)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200"); // 문자열도 가능
		Integer obj3 = Integer.valueOf("300");
		
		//UnBoxing : 기본타입 변수명 = 박싱참조변수.기본타입+Value()
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		// 출력
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}