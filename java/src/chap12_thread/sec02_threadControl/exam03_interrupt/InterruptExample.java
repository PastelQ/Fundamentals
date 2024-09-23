package chap12_thread.sec02_threadControl.exam03_interrupt;

/* interrupt() : 스레드가 일시 정지 상태에 있을 때 InterruptedException을 발생시킴
 -> 해당 부분을 이용해 run() 메서드 정상 종료 
 * 주의 : interrupt()가 실행되면 즉시 예외가 발생하지 않고 스레드가 미래에 일시 정지 상태가 되면 그때 예외 발생시킴 */
/** 1초 후 출력 스레드 중지 **/
public class InterruptExample {

	public static void main(String[] args) {
		
		Thread thread = new PrintThread2();
		thread.start();
		
		try { Thread.sleep(1000); } catch (InterruptedException e) { }
		
		// 스레드를 종료하기 위해 InterruptedException 발생
		thread.interrupt();
	}
}