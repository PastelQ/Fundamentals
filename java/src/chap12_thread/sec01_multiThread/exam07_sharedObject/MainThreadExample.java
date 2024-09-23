package chap12_thread.sec01_multiThread.exam07_sharedObject;

/* 공유 객체
 - Multi Thread 프로그램의 경우 스레드들이 객체를 공유해서 작업해야하는 경우가 있음
 - 스레드A가 사용하던 객체를 스레드B가 상태를 변경할 수 있기 때문에 스레드A가 의도한 것과 다른
  산출물이 나올 수 있음 */
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
		
		/* User1과 User2 스레드가 동시에 실행되기 때문에 Calculator의 setMemory 메서드가 동시에 호출
		 -> 이로 인해 100과 50이 메모리에 저장되지만 마지막에 실행된 스레드의 값이 최종적으로 남게되어
		  최종 값이 50으로 설정되어 의도와 다른 결과 산출 */
	}
}