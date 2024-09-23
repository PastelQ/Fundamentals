package chap05_referenceType.sec02_array.finalTest;

// 중첩된 for문을 사용하여 배열 전체 항목의 합, 평균값 구하기
public class NastedForLoopExample {

	public static void main(String[] args) {
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;		// 합계
		double avg = 0.0;	// 평균
		int count = 0;		// 배열의 총 길이를 담을 변수
		
		// 총 합계 구하기
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		// 평균 구하기
		avg = (double)sum/count;
		
		System.out.println("총합 : " + sum);
		System.out.println("총합 : " + avg);
	}
}
