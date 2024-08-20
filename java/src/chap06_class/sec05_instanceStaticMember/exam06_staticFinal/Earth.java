package chap06_class.sec05_instanceStaticMember.exam06_staticFinal;

// 상수(불변의 값) : static final
// 객체마다 저장할 필요가 없는 공용성을 함께 띄기 때문에 "static"과 함께 사용
public class Earth {

	// 상수 이름은 모두 대문자로 작성하는 것이 관례
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
}