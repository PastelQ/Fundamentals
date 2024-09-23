package chap12_thread.sec01_multiThread.exam03_anonymousRunnable;

import java.awt.Toolkit;

// Runnable 구현 클래스를 익명 구현 객체로 대체해 작업 스레드를 만들 수 있는 방법
public class BeepPrintExample3 {

	public static void main(String[] args) {
		
		// 익명 구현 객체 사용
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) { }
				}
			}
		});
		thread.start(); // 작업 thread 실행
		
		for(int i =0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) { }
		}
	}
}