package chap12_thread.sec01_multiThread.exam08_synchronizedMethod;

/** 공유 객체 + synchronized method 포함하여 문제 해결 **/
public class Calculator {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// 게산기 메모리에 값을 저장하는 메서드 + synchronized
	// -> 다른 스레드가 동기화 메서드를 실행하지 못하게 함
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			// Thread를 2초간 정지
			Thread.sleep(2000);
		} catch(InterruptedException e) { }
		
		// 현재 Thread 이름을 얻고, 메모리 값과 함께 출력
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		
	}
}