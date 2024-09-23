package chap11_basicJavaAPI.sec01_javalangPackage.exam23_autoBoxingUnboxing;

// 자동 박싱, 자동 언박싱 : 기본 타입 값을 직접 Boxing, Unboxing하지 않아도 자동적으로 진행
/* Auto Boxing : 포장 클래스 타입에 기본값이 대입될 경우에 발생
 ex) Integer obj = 100; */
/* Auto Unboxing : 기본 타입에 포장 객체가 대입되는 경우 & 연산
 ex1) int value1 = obj;
 ex2) int value2 = obj + 100; */
public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		
		// Auto Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		// 대입 시 Auto Unboxing
		int value = obj;
		System.out.println("value: " + value);
		
		// 연산 시 Auto Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}