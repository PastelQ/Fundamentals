package chap12_thread.sec01_multiThread.exam06_threadName;

public class ThreadA extends Thread{

	public ThreadA() {
		// 스레드 이름 설정
		setName("ThreadA");
	}
	
	@Override
	public void run() {
		// ThreadA 실행 내용
		for(int i=0; i<2; i++) {
			// Thread 이름을 얻어 출력
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}