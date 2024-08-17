package chap05_referenceType.sec02_array.exam04;

// 배열의 length 필드 : 읽기 전용
public class ArrayLengthExample {

	public static void main(String[] args) {
		
		int[] scores = { 83, 90, 87 };
		
		int sum = 0;
		
		// 배열의 길이로 평가문 작성할 때 용이
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총 합 :" + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}
