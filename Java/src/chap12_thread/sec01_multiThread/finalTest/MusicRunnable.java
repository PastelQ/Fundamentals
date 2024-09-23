package chap12_thread.sec01_multiThread.finalTest;

// Runnable 인터페이스 구현 클래스
public class MusicRunnable implements Runnable{
	
	// MusicRunnable 실행 내용
	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("음악을 재생합니다.");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
	}
}
