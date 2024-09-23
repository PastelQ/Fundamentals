package chap02;

import java.util.Scanner;

// 프로그램 실행 중 배열의 요솟수 결정하기
// 배열 요소의 최댓값을 구하는 프로그램 작성
public class MaxOfArray {

	static int maxOf(int[] a) {
		
		int max = a[0];
		
		// 반복문으로 인덱스를 비교하여 기존의 max값보다 클 경우 max 변수에 대입
		for(int i=0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	// 실행 메서드
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구하여라");
		System.out.println("사람 수: ");
		int num = stdIn.nextInt();
		
		// 사람수를 입력 받아 그 크기(요솟수)의 배열 생성
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("height["+i+"]:");
			height[i] = stdIn.nextInt();
		}
		// maxOf 메서드를 이용하여 출력
		System.out.println("최댓값은 \""+maxOf(height)+"\"입니다.");
	}
}
