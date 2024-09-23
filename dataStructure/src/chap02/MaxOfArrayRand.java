package chap02;

import java.util.Random;
import java.util.Scanner;

// 난수를 사용하여 배열의 요솟값 결정하기
public class MaxOfArrayRand {

	static int maxOf(int[] a) {
		// 최댓값 정수를 담을 변수 : a 배열의 첫번째 인덱스 값으로 초기화
		int max = a[0];
		
		for(int i=0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	// 실행 클래스
	public static void main(String[] args) {
		// java.util 패키지 Random 클래스
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구하여라");
		System.out.println("사람 수 : ");
		// 사람 수를 담을 변수 num (배열의 크기(요솟수)를 입력 받는 역할)
		int num = stdIn.nextInt();
		
		// num을 입력 받아 해당 크기의 배열 생성
		int[] height = new int[num];
		
		System.out.println("키 값은 하기와 같습니다");
		
		for(int i=0; i<num; i++) {
			height[i] = 100 + rand.nextInt(90); // 요솟값을 난수로 결정
			System.out.println("heigth["+i+"]: "+height[i]);
		}
		
		System.out.println("최댓값은 "+maxOf(height)+"입니다.");
	}
}
