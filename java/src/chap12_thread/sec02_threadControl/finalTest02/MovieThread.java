package chap12_thread.sec02_threadControl.finalTest02;

public class MovieThread extends Thread {

	@Override
	public void run() {
		// 반복문
		while(true) {
			System.out.println("동영상을 재생합니다.");
			
			try { Thread.sleep(1000); } catch(InterruptedException e) { }
		}	
	}
}