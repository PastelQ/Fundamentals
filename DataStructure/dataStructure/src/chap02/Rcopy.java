package chap02;

import java.util.Arrays;
import java.util.Scanner;

// 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 작성
public class Rcopy {
	
	// 배열 b의 역순으로 배열 a에 복사
	static void rcopy(int[] a, int[] b) {
		
		for(int i=0; i<a.length; i++) {
			a[i] = b[b.length-i-1];
		}
	}
	
	// 실행 클래스
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		// 변수 미리 선언
		int numA;	// A 요솟수
		int numB;	// B 요솟수
		int[] a;	// a 배열 (복사 받을 배열)
		int[] b;	// b 배열 (복사 해줄 배열)
		
		// a 배열 복사 받을 배열
		System.out.println("A 요솟수 입력 : ");
		numA = stdIn.nextInt();
		
		// 요솟수 크기의 배열 생성 및 값 받기
		a = new int[numA];
		
		for(int i=0; i<numA; i++) {
			System.out.println("값 입력");
			a[i] = stdIn.nextInt();
		}
		System.out.println("배열 A = " + Arrays.toString(a));
		
		
		// b 배열 복사 해줄 배열
		System.out.println("B 요솟수 입력 : ");
		numB = stdIn.nextInt();
		
		// 요솟수 크기의 배열 생성 및 값 받기
		b = new int[numB];
		
		for(int i=0; i<numB; i++) {
			System.out.println("값 입력");
			b[i] = stdIn.nextInt();
		}
		System.out.println("배열 B = " + Arrays.toString(b));
		
		// rcopy()로 복사
		System.out.println("복사를 진행합니다");
		rcopy(a,b);
		
		
		System.out.println("결과 : 배열 A = " + Arrays.toString(a));
		System.out.println("결과 : 배열 B = " + Arrays.toString(b));
	}
}
