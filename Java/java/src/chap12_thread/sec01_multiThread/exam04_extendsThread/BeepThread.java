package chap12_thread.sec01_multiThread.exam04_extendsThread;

import java.awt.Toolkit;

// 작업 thread가 실행할 작업을 Runnable로 만들지 않고 Thread의 하위 클래스로 작업 스레드를 정의하면서 작업 내용 포함시키기
public class BeepThread extends Thread{ // Thread 클래스 상속

	// run() 메서드 재정의
	@Override
	public void run() {
		// Thread 실행 내용
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) { }
		}
	}
}
