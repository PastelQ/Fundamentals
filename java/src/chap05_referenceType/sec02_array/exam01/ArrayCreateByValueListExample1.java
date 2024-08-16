package chap05_referenceType.sec02_array.exam01;

// 값 목록으로 배열 생성
/* 배열 생성하는 방법 2가지
 1. new 연산자 사용 : 타입[] 변수 = new 타입[]
 2. 값 목록으로 생성 : 타입[] 변수 = {값1,값2..값n}
 */
public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		
		int[] score = {83, 90, 87};
		
		// 각 인덱스로 출력하는 방법
		System.out.println("scores[0] : " + score[0]);
		System.out.println("scores[1] : " + score[1]);
		System.out.println("scores[2] : " + score[2]);
		
		// for문으로 출력하는 방법 여기서는 합계를 출력
		int sum = 0;
		
		for(int i=0; i<3; i++) {
			sum += score[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double)sum / score.length;
		
		System.out.println("평균 : " + avg);
	}
}
