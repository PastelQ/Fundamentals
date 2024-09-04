package chap12_thread.sec01_multiThread.finalTest;

// 확인 문제 : 동영상과 음악을 재생하기 위해 2가지 Thread 실행
public class ThreadExample {

	public static void main(String[] args) {
		
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
	}
}
