package chap12_thread.sec02_threadControl.finalTest01;

// 확인 문제 : 1초 후 MovieThread의 interrupt()를 호출해 MovieThread를 안전하게 종료하기
public class ThreadExample {

	public static void main(String[] args) {
		
		Thread thread = new MovieThread();
		thread.start();
		
		try { Thread.sleep(1000); } catch(InterruptedException e) { }
		
		// interrupt() 호출
		thread.interrupt();
	}
}