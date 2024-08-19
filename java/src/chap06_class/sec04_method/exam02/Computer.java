package chap06_class.sec04_method.exam02;

// 매개 변수의 갯수를 모를 경우 > 매개 변수를 배열 타입으로 선언 or ...(가변 인자)
public class Computer {

	// 배열로 매개변수를 받아 for문을 통해 연산 후 결과를 반환
	int sum1(int[] values) {
		// 리턴할 변수 초기화
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// 배열을 생성하지 않고 값의 목록만 넘겨주는 방법(... 을 이용)
	int sum2(int ... values) {
		
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
