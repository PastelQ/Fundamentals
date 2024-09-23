package chap12_thread.sec02_threadControl.exam02_stop;

public class PrintThread1 extends Thread{
	// 쓰레드를 종료하기 위한 stop flag / boolean 타입
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	// 해당 Thread 실행 내용
	@Override
	public void run() {
		// stop이 false일 때 반복하는 while문
		while(! stop) {
			System.out.println("실행 중");
		}
		// 반복이 끝나면 자원 정리
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}