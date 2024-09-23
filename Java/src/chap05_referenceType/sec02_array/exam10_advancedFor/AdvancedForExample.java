package chap05_referenceType.sec02_array.exam10_advancedFor;

// 향상된 for문
public class AdvancedForExample {

	public static void main(String[] args) {
		
		int scores[] = {91, 82, 73, 62, 51};	// 점수 배열
		int sum = 0;							// 합계
		double avg;								// 평균
		
		// 총합 계산
		for (int score : scores) {
			sum += score;
		}
		System.out.println("점수 총합 : " + sum);
		
		// 평균 계산
		avg = (double)sum/scores.length;
		System.out.println("점수 평균 : " + avg);
	}
}
