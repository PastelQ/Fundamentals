package chap12_thread.sec02_threadControl.finalTest02;

// 확인 문제 : 메인 스레드가 종료되면 MovieThread도 같이 종료되게 만들기
public class ThreadExample {

	public static void main(String[] args) {
		
		Thread thread = new MovieThread();
		// MovieThread를 Daemon스레드로 설정하여 메인 스레드가 끝나면 함께 종료됨
		thread.setDaemon(true);
		thread.start();
		
		try { Thread.sleep(3000); } catch(InterruptedException e) { }
	} 
}