package chap12_thread.sec02_threadControl.exam05_daemonThread;

/* DaemonThread : 주 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
 - 주 스레드가 종료되면 데몬 스레드는 강제적으로 종료되며 이외 일반 스레드와 큰 차이 없음
 
 * 데몬 스레드 생성 방법 
 - 주 스레드에서 데몬이 될 스레드의 setDaemon(true)를 호출
 - 현재 실행 스레드가 데몬 스레드인지 구분하는 방법은 isDaemon()의 리턴값이 true인 지 확인 */
/** 1초 주기로 save()를 자동 호출하는 데몬스레드를 가진 메인 스레드 **/
public class DaemonExample {

	public static void main(String[] args) {
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		// AutoSaveThread를 mainThread의 데몬 스레드로 만듦
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			// 데몬 스레드는 1초 주기로 반복하고 있으나 메인 스레드는 3초 정지 후 종료되어 함께 종료됨
			Thread.sleep(3000);
		} catch(InterruptedException e) { }
		
		System.out.println("main Thread 종료");
	}
}