package chap06_class.sec04_method.exam01_method;

// Calculator.java 에 작성한 메서드 호출
public class CalculatorExample {

	public static void main(String[] args) {
		
		// 생성자 호출(기본 생성자)
		Calculator cal = new Calculator();
		
		// 전원 켜는 메서드
		cal.powerOn();
		
		// 더하기 메서드
		int result1 = cal.plus(5, 5);
		System.out.println("result1 : " + result1);
		
		// 나누기 메서드
		byte x = 10;
		byte y = 4;
		double result2 = cal.divide(x, y);
		System.out.println("result2 : " + result2);
		
		// 전원 끄는 메서드
		cal.powerOff();
	}
}
