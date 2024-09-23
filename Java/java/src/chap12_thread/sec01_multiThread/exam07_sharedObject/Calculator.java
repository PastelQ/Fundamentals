package chap12_thread.sec01_multiThread.exam07_sharedObject;

/** 공유 객체 **/
public class Calculator {

	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	// 게산기 메모리에 값을 저장하는 메서드
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			// Thread를 2초간 정지
			Thread.sleep(2000);
		} catch(InterruptedException e) { }
		
		// 현재 Thread 이름을 얻고, 메모리 값과 함께 출력
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		
	}
}