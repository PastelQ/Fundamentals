package chap12_thread.sec01_multiThread.exam04_extendsThread;

/** 메인 스레드와 작업 스레드가 동시에 실행 **/
public class BeepPrintExample4 {

	public static void main(String[] args) {
		
		// BeepThread 클래스를 이용해 작업 스레드 객체 생성
		Thread thread = new BeepThread();
		thread.start(); // 작업 스레드 실행
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) { }
		}
	}
}