package chap12_thread.sec01_multiThread.exam05_anonymousSubClass;

import java.awt.Toolkit;

// exam04의 예제를 Thread의 익명 자식 객체를 이용하여 작업 스레드 만들기
public class BeepPrintExample5 {

	public static void main(String[] args) {
		
		// 익명 자식 객체 생성
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) { }
				}
			}
		};
		thread.start(); // thread 실행
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) { }
		}
	}
}