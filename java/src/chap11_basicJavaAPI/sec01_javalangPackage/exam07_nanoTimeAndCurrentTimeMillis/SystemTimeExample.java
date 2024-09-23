package chap11_basicJavaAPI.sec01_javalangPackage.exam07_nanoTimeAndCurrentTimeMillis;

// 현재 시간 읽기(currentTimeMillis(), nanoTime())
/* System 클래스의 상기 2개 메서드는 컴퓨터의 시계로부터 현재 시간을 읽어 밀리세컨드(1/1000초) 단위와,
 나노세컨드(1/10^9초) 단위의 long 값을 리턴 */
public class SystemTimeExample {

	// 해당 메서드의 리턴값은 주로 프로그램 실행 소요 시간 측정에 사용됨
	// 프로그램 시작 시 시각을 읽고 프로그램이 끝날 때 시각을 읽어서 차이로 "프로그램 실행 소요 시간"을 구함
	public static void main(String[] args) {
		
		// 시작 시간 읽기 (System.nanoTime() 사용)
		long time1 = System.nanoTime();
		
		// 1~1000000까지의 합을 구하는 연산
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		// 끝 시간 읽기
		long time2 = System.nanoTime();
		
		System.out.println("1~1000000까지의 합 : " + sum );
		System.out.println("게산에 " + (time2 - time1) + " 나노초가 소요되었습니다.");
	}
}