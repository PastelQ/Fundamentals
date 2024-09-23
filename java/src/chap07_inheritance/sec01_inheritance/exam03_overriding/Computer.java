package chap07_inheritance.sec01_inheritance.exam03_overriding;

// Calculator를 상속 받는 하위 클래스
public class Computer extends Calculator{

	@Override // @Override 명시
	double areaCircle(double r) {	// 부모 클래스와 메서드명 리턴타입 매개변수 리스트 동일해야 함
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r; // 리턴값에 자바 표준 API Math(수학 관련 필드, 메서드들을 가지고 있는 클래스) 사용
	}
}