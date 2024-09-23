package chap12_thread.sec01_multiThread.exam08_synchronizedMethod;

/** User1 Thread **/
public class User1 extends Thread{

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1"); // 스레드 이름 User1로 저장
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		// 공유 객체인 Calculator의 메모리에 100을 저장
		calculator.setMemory(100);
	}
}