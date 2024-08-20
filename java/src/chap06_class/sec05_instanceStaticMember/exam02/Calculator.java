package chap06_class.sec05_instanceStaticMember.exam02;

// 정적 멤버(static member) : 클래스에 고정된 멤버로 객체를 생성하지 않고 사용할 수 있는 필드 메서드
/* 사용 이유 : 객체의 필드값이 모두 같아야할 경우 객체마다 가지고 있을 필요가 없기 때문에
 1. 인스턴스 멤버 -> 객체마다 가지고 있는 멤버
 2. 정적 멤버    -> 클래스에 위치시키고 객체들이 공유하는 멤버 
 
 * 사용 : 생성자를 호출하여 객체 참조 변수로도 접근 가능하지만 클래스 이름으로 접근을 권장 */
public class Calculator {

	// 정적 멤버(필드, 메서드)
	// pi 같은 경우에는 값이 변할 일이 없음
	static double pi = 3.14159;
	// 더하기 연산 메서드
	static int plus(int x, int y) {
		return x + y;
	}
	// 빼기 연산 메서드
	static int minus(int x, int y) {
		return x - y;
	}
}