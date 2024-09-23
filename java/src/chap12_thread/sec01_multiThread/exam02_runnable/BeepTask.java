package chap12_thread.sec01_multiThread.exam02_runnable;

import java.awt.Toolkit;

// Runnable(인터페이스) : 작업 스레드가 실행할 수 있는 코드를 가지고 있는 객체
// > 추상메서드 run()이 정의되어 있는데 구현 객체를 만들어 대입할 때 run()을 재정의 해 작업 스레드가 실행할 코드 작성
/** 비프음을 들려주는 작업 정의 **/
public class BeepTask implements Runnable{ // Runnable을 구현

	@Override
	public void run() {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) { }
		}
	}
}