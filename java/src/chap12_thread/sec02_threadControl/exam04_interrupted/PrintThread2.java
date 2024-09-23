package chap12_thread.sec02_threadControl.exam04_interrupted;

public class PrintThread2 extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("실행 중");
			// sleep 없이 interrupted()로 interrupt()가 실행되고 있다면 반복 중지
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}