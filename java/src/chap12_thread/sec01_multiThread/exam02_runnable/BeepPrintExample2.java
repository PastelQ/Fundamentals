package chap12_thread.sec01_multiThread.exam02_runnable;

/** Main Thread와 작업 Thread가 동시에 실행 **/
public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		// BeepTask(Runnable 구현 클래스) 인스턴스 생성
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask); // 작업 스레드 생성
		thread.start();						  // 비프음 발생 시작
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) { }
		}
	}
}