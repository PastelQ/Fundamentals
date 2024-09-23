package chap06_class.sec05_instanceStaticMember.exam02_staticMember;

// 정적 멤버 사용(Calculator.java에 선언되어 있는 정적 멤버 사용)
// -> 정적 요소는 클래스 이름으로 접근하는 것이 좋음
public class CalculatorExample {

	public static void main(String[] args) {
		
		// 정적 필드 pi를 사용
		double result1 = 10 * 10 * Calculator.pi;
		// 정적 메서드 plus(), minus() 사용
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}