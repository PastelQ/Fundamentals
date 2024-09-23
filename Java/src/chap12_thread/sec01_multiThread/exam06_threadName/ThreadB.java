package chap12_thread.sec01_multiThread.exam06_threadName;

public class ThreadB extends Thread{

	@Override
	public void run() {
		// ThreadB 실행 내용
		for(int i=0; i<2; i++) {
			// Thread 이름을 얻어 출력
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}