package chap06_class.sec04_method.exam06;

// 메서드 오버로딩 : 중복 정의된 areaRectangle()를 사용
public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		// 정사각형 넓이 구하기 (매개변수 1개)
		double result1 = cal.areaRectangle(10);
		
		// 직사각형 넓이 구하기 (매개변수 2개)
		double result2 = cal.areaRectangle(10, 20);
		
		System.out.println("정사각형 : " + result1);
		System.out.println("직사각형 : " + result2);
	}
}
