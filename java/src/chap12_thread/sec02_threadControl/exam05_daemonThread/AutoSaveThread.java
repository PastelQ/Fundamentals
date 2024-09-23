package chap12_thread.sec02_threadControl.exam05_daemonThread;

public class AutoSaveThread extends Thread{

	public void save() {
		System.out.println("작업 내용 저장함.");
	}
	
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				break;
			}
			save();
		}
	}
}