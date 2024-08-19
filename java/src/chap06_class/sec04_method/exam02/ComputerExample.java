package chap06_class.sec04_method.exam02;

// 매개 변수의 개수를 모를 경우 메서드 호출(Computer.java)
public class ComputerExample {

	public static void main(String[] args) {
		
		// 생성자 호출
		Computer com = new Computer();
		
		// 메서드 호출 시 배열 타입 넘겨주기 1
		int[] values1 = {1, 2, 3};
		int result1 = com.sum1(values1);
		System.out.println("result1 : " + result1);
		
		// 메서드 호출 시 배열 타입 넘겨주기 2
		int result2 = com.sum1(new int[] {1,2,3,4});
		System.out.println("result2 : " + result2);
		
		// 값 목록 넘겨주기 1
		int result3 = com.sum2(1,2,3);
		System.out.println("result3 : " + result3);
		
		// 값 목록 넘겨주기 2(방식 동일)
		int result4 = com.sum2(1,2,3,4,5);
		System.out.println("result4 : " + result4 );
	}
}