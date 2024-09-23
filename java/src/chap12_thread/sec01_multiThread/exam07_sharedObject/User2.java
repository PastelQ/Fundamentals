package chap12_thread.sec01_multiThread.exam07_sharedObject;

/** User2 Thread **/
public class User2 extends Thread{

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2"); // 스레드 이름 User2로 저장
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		// 공유 객체인 Calculator의 메모리에 50을 저장
		calculator.setMemory(50);
	}
}