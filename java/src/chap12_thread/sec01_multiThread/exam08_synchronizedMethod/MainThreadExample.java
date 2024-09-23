package chap12_thread.sec01_multiThread.exam08_synchronizedMethod;

/* 동기화 메서드(Synchronized method)
 - 스레드가 사용 중인 객체를 다른 스레드가 변경할 수 없게 하려면 스레드 작업이 끝날 때까지 객체에
  잠금을 걸어 다른 스레드가 사용할 수 없도록 해야 함
 * 임계영역(Critical section) : 멀티 스레드 프로그램에서 단 하나의 스레드만 실행할 수 있는 코드 영역
 - JAVA에서는 임계 영역을 지정하기 위해 동기화 메서드(Synchronized Method)를 제공
 - 내부의 동기화 메서드를 실행하면 즉시 객체에 잠금을 걸어 다른 스레드가 동기화 메서드를 실행하지 못하게 함
 - 동기화 메서드가 여러 개 있을 경우 다른 스레드는 해당 메서드, 다른 동기화 메서드도 실행할 수 없음 
  다만, 다른 스레드에서 일반 메서드는 실행이 가능 */
/** 메인 Thread가 실행하는 코드 **/
public class MainThreadExample {

	public static void main(String[] args) {
		// 공유 객체 인스턴스 생성
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();		 // User1 스레드 생성
		user1.setCalculator(calculator); // 공유 객체 설정
		user1.start();					 // User1 스레드 시작
		
		User2 user2 = new User2();		 // User2 스레드 생성
		user2.setCalculator(calculator); // 공유 객체 설정
		user2.start();					 // USer2 스레드 시작
		
	}
}