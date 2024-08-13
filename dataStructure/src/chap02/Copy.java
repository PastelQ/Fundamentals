package chap02;

import java.util.Arrays;
import java.util.Scanner;

// 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성
// b[]만 입력 받고 요솟수와 요소값들이 모두 일치하는 
public class Copy {

	static int[] copy(int[] a, int[] b) {
		// b의 크기와 같은 복사 받을 배열 생성
		int[] result = new int[b.length];
		
		for(int i=0; i<b.length; i++) {
			result[i] = b[i];
		}
		// 결과 값 반납
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int num;	// 요솟수를 받을 변수
		int[] a;	// 복사를 받을 정수 배열 a
		int[] b;	// 복사가 필요한 배열
		
		System.out.println("요솟수 입력 : ");
		num = stdIn.nextInt();
		
		// 받은 num 크기의 배열 b 생성
		b = new int[num];
		
		for(int i=0; i<b.length; i++) {
			System.out.println("값 입력 : ");
			b[i] = stdIn.nextInt();
		}
		
		// copy()의 경우 복사를 받을 배열, 복사를 할 배열 2개의 배열이 필요
		// 1. b와 같은 크기의 빈 배열을 생성 (복사 당할 배열)
		// 2. b 배열(사용자에게 입력 받은 배열)
		a = copy(new int[b.length],b);
		
		System.out.println("a: "+Arrays.toString(a));
		System.out.println("b: "+Arrays.toString(b));
		
		// 주소를 출력하여 서로 다른 지 확인
		System.out.println("a 주소 : "+ a);
		System.out.println("b 주소 : "+ b);
	}
}
