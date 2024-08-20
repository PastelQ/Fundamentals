package chap05_referenceType.sec02_array.exam02_newOperator;

// 값 목록으로 배열 생성 2 : new 연산자 사용 후 값 목록을 지정하는 방법도 가능
public class ArrayCreateByValueListExample2 {
	// 실행 메서드
	public static void main(String[] args) {
		
		int[] scores;
		
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("총합 : " + sum1);
		
		
		// sum2는 사용자가 지정한 메서드 add()를 이용하여 합계 도출
		int sum2 = add(new int[] {83, 90, 87});
		
		System.out.println("총합 : " + sum2);
	}
	
	// 배열의 총합을 계산하여 리턴하는 메서드 add()
	public static int add(int[] scores) {
		
		int sum = 0;
		
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
