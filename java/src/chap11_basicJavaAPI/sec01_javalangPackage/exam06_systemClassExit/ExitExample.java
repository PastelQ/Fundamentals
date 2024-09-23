package chap11_basicJavaAPI.sec01_javalangPackage.exam06_systemClassExit;

// System 클래스, System.exit(0) 
/* Java 프로그램은 운영체제에서 실행되는 것이 아닌 JVM 위에서 실행됨
  운영체제의 모든 기능을 이용할 순 없으나, java.lang.System 클래스를 이용할 경우 일부 이용 가능 */
// System 클래스의 모든 필드와 메서드는 정적 필드, 메서드로 이루어져 있음
public class ExitExample {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i==5) {
				// System.exit(0) : JVM 강제 종료 -> int 값을 매개값으로 지정하게 되어 있는데 
				// "종료 상태값" 이라고 부르며 일반적으로 정상 종료일 경우 0값을 줌
				System.exit(0);
			}
		}
		// i가 5일 경우 종료되기 때문에 하기 "마무리 코드" 출력은 되지 않음
		System.out.println("마무리 코드");
	}
}