package chap12_thread.sec01_multiThread.exam06_threadName;

/* Thread 이름 : Thread는 본인의 이름을 가지고 있음
 - 디버깅할 때 어떤 스레드가 어떤 작업을 하는 지 조사할 때 종종 사용됨
 - main thread 이름 : main
 - 직접 생성한 스레드 : Thread-n(스레드 번호)로 자동 생성 (Thread 클래스의 setName() 메서드로 변경도 가능)
  반대로 스레드 이름을 얻을 땐 Thread 클래스의 getName()를 이용해 얻을 수 있음 
 * 단, getName(), setName()은 Thread 클래스의 인스턴스 메서드로 스레드 객체의 참조가 필요
  - Thread 객체의 참조를 가지고 있지 않다면, Thread 클래스의 정적 메서드인 currentThread()를 이용해
   현재 스레드의 참조를 얻을 수 있음*/
/** main Thread 이름 출력 및 UserThread 생성 및 시작 **/
public class ThreadNameExample {

	public static void main(String[] args) {
		// 이 코드를 실행하는 스레드 객체 얻기
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA(); 						  // ThreadA 생성
		System.out.println("작업 스레드 이름: " + threadA.getName()); // ThraedA 이름 얻기
		threadA.start();										  // ThreadA 시작
		
		ThreadB threadB = new ThreadB(); 						  // ThreadB 생성
		System.out.println("작업 스레드 이름: " + threadB.getName()); // ThraedB 이름 얻기
		threadB.start();										  // ThreadB 시작
	}
}