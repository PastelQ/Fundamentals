package chap12_thread.sec02_threadControl.exam02_stop;

/* Thread의 안전한 종료
 - 스레드는 자신의 run()가 모두 실행되면 자동적으로 종료되나 경우에 따라 실행 중인 스레드를 즉시 종료할 때가 있음
 - 원래는 Thread에서 stop()를 지원하고 있었으나 리소스 불완전 종료 문제 등으로 인해 사용이 중지됨
 
 * stop flag
 - 스레드는 run() 메서드가 끝나면 자동적으로 종료되므로 해당 메서드가 정상적으로 종료되도록 유도하는 것이 중요
 - boolean 타입 stop 필드를 놓고 while문의 조건식을 통해 false일 경우 while문을 빠져나오는 방법으로 진행 */
public class StopFlagExample {

	public static void main(String[] args) {
		
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try { Thread.sleep(1000); } catch(InterruptedException e) { }
		
		printThread.setStop(true);
	}
}