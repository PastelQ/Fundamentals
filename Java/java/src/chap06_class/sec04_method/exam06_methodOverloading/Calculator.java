package chap06_class.sec04_method.exam06_methodOverloading;

// 메서드 오버로딩 : 같은 이름의 메서드 여러개 선언 ! 중복정의
/* 조건
 * 1. 같은 클래스 내
 * 2. 매개 변수의 타입, 개수, 순서 중 하나가 달라야 함
 * 3. 매개값을 받아 블럭 내에서는 로직 변경이 가능함 */
public class Calculator {

	// 정사각형 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}