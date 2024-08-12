package chap02;

import java.util.Random;

// 키 뿐이 아니라 사람 수도 난수로 생성되도록 ReverseArrayRand.java 수정
public class ReverseArrayRand2 {
	
	static int maxOf(int[] a) {
		// 최댓값 정수를 담을 변수
		int max = a[0]; // 첫번째 인덱스에 담고 이후 비교
		
		for(int i=0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	// 실행 클래스
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		System.out.println("사람 수, 키의 값을 자동으로 입력");
		
		// 사람 수 랜덤 설정(임의로 10명 까지)
		int num = rand.nextInt(10);
		
		// 설정된 랜덤값 요솟수(배열 크기)의 배열 생성
		int[] height = new int[num];
		
		// 값(키) 랜덤 입력
		for(int i=0; i<num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height["+i+"] = " + height[i]);
		}
		
		System.out.println("최댓값은 "+maxOf(height)+"입니다.");
	}
}
