package chap12_thread.sec02_threadControl.exam01_sleep;

import java.awt.Toolkit;

/* Thread 상태
 - 스레드 객체 생성 및 start()를 호출할 경우 실행 대기 상태로 바뀜(곧바로 스레드가 실행되는 것이 아님)
 
 # 실행 상태(running)
 - 운영 체제는 실행 대기 상태에 있는 스레드를 선택하고 CPU(코어)가 run()메서드를 실행하도록 함
 - 실행 상태의 스레드는 run()를 모두 실행하기 전에 다시 실행 대기 상태로 돌아갈 수 있으며,
  실행 대기 상태에 있는 다른 스레드가 선택되어 실행 상태가 됨
 - 스레드는 이렇게 실행 대기 상태와 실행 상태를 번갈아가면서 자신의 run()를 조금씩 실행 
 
 # 종료 상태(terminated)
 - 실행 상태에서 run()가 종료될 경우 더 이상 실행할 코드가 없어 스레드 실행이 멈추게 됨 */
/** 스레드 상태 제어(sleep(long millis)) **/
public class SleepExample {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<10; i++) {
			toolkit.beep();
				// sleep()으로 일시 정지된 상태에서 주어진 시간이 되기 전에 interrupt()가 호출될 경우
				// InterruptedException이 발생하므로 예외 처리 필요
				try {
					// Thread 제어 : 3초 동안 메인 스레드를 일시 정지 상태로 만듦
					Thread.sleep(3000);
				} catch(InterruptedException e) { }
		}
		// 메인 스레드를 비프음이 울리고 3초 동안 일시 정지 상태로 보냈다가 다시 실행 준비 상태로 돌아오게 함
	}
}