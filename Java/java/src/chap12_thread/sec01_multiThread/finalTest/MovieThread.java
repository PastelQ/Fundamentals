package chap12_thread.sec01_multiThread.finalTest;

// Thread 클래스를 상속
public class MovieThread extends Thread {
	
	// MovieThread 실행 내용
	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("동영상을 재생합니다.");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
	}
}