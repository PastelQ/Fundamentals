package chap12_thread.sec02_threadControl.finalTest01;

public class MovieThread extends Thread {

	@Override
	public void run() {
		
		while(true) {
			System.out.println("동영상을 재생합니다.");
			
			// 현재 interrupt() 호출되어 있는 상태라면 true를 반환하기에 반복문 종료
			if(Thread.interrupted()) {
				break;
			}
		}
	}
}