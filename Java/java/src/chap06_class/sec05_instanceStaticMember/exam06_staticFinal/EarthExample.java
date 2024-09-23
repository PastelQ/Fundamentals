package chap06_class.sec05_instanceStaticMember.exam06_staticFinal;

// 상수 사용 예시 : Earth.java
public class EarthExample {

	public static void main(String[] args) {
		// static으로 별도 인스턴스 생성이 필요 없이 클래스 이름으로 접근 가능
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적 : " + Earth.EARTH_AREA + "km^2");
	}
}