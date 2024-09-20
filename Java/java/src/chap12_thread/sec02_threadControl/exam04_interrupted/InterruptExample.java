package chap12_thread.sec02_threadControl.exam04_interrupted;

/* 일시 정지를 만들지 않고도 interrupt()호출 여부 확인
 interrupted() / isInterrupted()
 - interrupte()가 호출되었다면 상기 두 메서드는 true를 리턴
 - interrupted() : 정적 메서드로 현재 스레드가 interrupted 되었는 지 확인
 - isInterrupted() : 인스턴스 메서드로 현재 스레드가 interrupted 되었는 지 확인 */
public class InterruptExample {

	public static void main(String[] args) {
		
		Thread thread = new PrintThread2();
		thread.start();
		
		try { Thread.sleep(1000); } catch (InterruptedException e) { }
		
		// 스레드를 종료하기 위해 InterruptedException 발생
		thread.interrupt();
	}
}