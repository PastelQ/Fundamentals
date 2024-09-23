package chap11_basicJavaAPI.sec01_javalangPackage.exam26_MathClass;

// Math Class : 수학 계산에 사용할 수 있는 메서드를 제공하는 클래스
/* java.lang 패키지에 속해있는 Math 클래스에서 제공하는 메서드는 모두 정적(static) 메서드로
  Math 클래스로 바로 사용이 가능함 */

public class MathExample {

	public static void main(String[] args) {
		
		// 절대값 : int/double abs(int a / double d)
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("정수 절대값 : " + v1);
		System.out.println("실수 절대값 : " + v2);
		
		// 올림값 : double ceil(double d)
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("양의 실수 올림값 : " + v3);
		System.out.println("음의 실수 올림값 : " + v4);
		
		// 버림값 : double floor(double d)
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("양의 실수 버림값 : " + v5);
		System.out.println("음의 실수 버림값 : " + v6);
		
		// 최대값 : int/double max(int a, int b / double a, double b)
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("정수 최대값 : " + v7);
		System.out.println("실수 최대값 : " + v8);
		
		// 최소값 : int/double min(int a, int b / double a, double b)
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("정수 최소값 : " + v9);
		System.out.println("실수 최소값 : " + v10);
		
		// 랜덤값 : double random()
		double v11 = Math.random();
		System.out.println("랜덤값(실수) : " + v11);
		
		// 가까운 정수의 실수 값 : double rint(double d)
		double v12 = Math.rint(5.3);	// 5.0
		double v13 = Math.rint(5.7);	// 6.0
		System.out.println("대입한 실수에서 가까운 정수의 실수값(5.3) : " + v12);
		System.out.println("대입한 실수에서 가까운 정수의 실수값(5.7) : " + v13);
		
		// 반올림값 : long round(double d)
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("반올림값(5.3) : " + v14);
		System.out.println("반올림값(5.7) : " + v15);
		
		// round() 응용 : round()는 항상 소수점 첫째 자리에서 반올림해 정수값을 리턴
		// 하기 예시에서는 원하는 소수 자릿수(여기선 셋째 자리)에서 반올림할 수 있도록 10^n을 곱한 후 다시 10^n.0을 나눠줌 
		double value = 12.3456;
		double temp1 = value * 100;		 // 10^n을 곱함
		long temp2 = Math.round(temp1);  // round() -> 소수 첫째자리에서 반올림
		double v16 = temp2 / 100.0;		 // 실수 타입의 변수에 자동형변환이 가능하게 10^n.0을 다시 나눔
		System.out.println("round()응용 - 원하는 자리에서 반올림 : " + v16);
	}
}