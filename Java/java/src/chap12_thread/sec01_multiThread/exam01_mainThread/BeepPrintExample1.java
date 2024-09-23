package chap12_thread.sec01_multiThread.exam01_mainThread;

import java.awt.Toolkit;

// Process : 애플리케이션을 실행하면 운영체제로부터 실행에 필요한 메모리를 할당 받아 애필리케이션이 실행되는 과정
/* Thread : 프로세스 내부에서 코드의 실행 흐름
 - 하나의 thread는 하나의 코드 실행 흐름으로 프로세스 내 스레드가 여러 개일 경우 MultiThread라고 칭함
 - 멀티 프로세스(2개 이상의 프로세스)는 운영 체제에서 할당 받은 메모리를 각각 가지고 실행하기 때문에 각 프로세스는 독립적이나
  멀티 스레드의 경우 하나의 프로세스 내부에 생성되기 때문에 하나의 스레드가 예외를 발생할 경우 다른 스레드에 영향을 미침 */
/* 멀티 스레드 활용 : 대용량 데이터 처리시간을 줄이기 위해 데이터를 분할해 병렬로 처리하거나
  UI를 가지고 있는 애플리케이션에서 네트워크 통신을 하기 위해 사용, 다수 클라이언트 요청을 처리하는 서버 개발시에도 활용됨 
  애플리케이션을 개발하는데 필요한 기능으로 이해하고 활용할 수 있어야 함 */
/* main thread : 자바의 모든 애플리케이션은 main thread가 main()를 실행하면서 시작, 싱글 스레드 애플리케이션의 경우 
  메인 스레드가 종료되면 프로세스가 종료되나, 멀티 스레드 애플리케이션일 경우 실행 중인 스레드가 하나라도 있다면 프로세스 종료되지 않음 */
/* 작업 thread 생성 / 실행 : 멀티 스레드로 실행하는 앱을 개발하려면 먼저 몇 개의 작업을 병렬로 실행할 지 결정하고 스레드를 생성
  자바에서는 작업 스레드도 객체로 생성되기 때문에 클래스가 필요하며 java.lang.Thread 클래스를 직접 객체화해 생성도 가능하지만,
  Thread 클래스를 상속해 하위 클래스를 만들어 생성도 가능 */
/** Thread 클래스로부터 직접 생성 **/
public class BeepPrintExample1 {
	
	public static void main(String[] args) {
		// Toolkit 객체 얻기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		// '비프음 발생'과 '출력'은 다른 작업으로 메인 스레드가 두가지 작업을 처리할 수 없어 비프음 모두 발생 후 출력 시작
		for(int i=0; i<5; i++) {
			toolkit.beep();	// 비프음 발생
			// 0.5초간 일시 정지
			try { Thread.sleep(500); } catch(Exception e) { }
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			// 0.5초간 일시 정지
			try { Thread.sleep(500); } catch(Exception e) { }
		}
	}	
}