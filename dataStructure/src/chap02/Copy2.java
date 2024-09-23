package chap02;

import java.util.Arrays;
import java.util.Scanner;

// Copy.java를 배열 a,b 모두 입력 받아 진행하는 부분으로 변경
public class Copy2 {

	// 배열 a,b를 받아 복사를 진행하는 메서드
	static void copy(int[] a, int[] b) {
		
		// 배열 a의 크기만큼 반복 지정
		for(int i=0; i<a.length; i++) {
			a[i] = b[i];
		}
	}
	
	// 실행 클래스
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		// 한 번에 정리해서 알 수 있게 미리 선언
		int numA;	// a 배열의 요솟수
		int numB;	// b 배열의 요솟수
		int[] a;	// a 배열
		int[] b;	// b 배열
		
		// A배열(복사 받을 배열)
		System.out.println("A배열의 요솟수 입력 : ");
		numA = stdIn.nextInt();
		
		// numA를 받아 그 크기의 배열 생성 및 값 받기
		a = new int[numA];
		
		for(int i=0; i<numA; i++) {
			System.out.println("A배열 ["+i+"] :");
			a[i] = stdIn.nextInt();
		}
		System.out.println("A 배열 입력 완료" + Arrays.toString(a));
		
		
		// B배열(복사할 배열)
		System.out.println("B배열의 요솟수 입력 : ");
		numB = stdIn.nextInt();
		
		// numB를 받아 그 크기의 배열 생성 및 값 받기
		b = new int[numB];
		
		for(int i=0; i<numB; i++) {
			System.out.println("B배열 ["+i+"] :");
			b[i] = stdIn.nextInt();
		}
		System.out.println("B 배열 입력 완료" + Arrays.toString(b));
		
		
		// copy()를 이용해 복사
		copy(a,b);
		
		// a, b배열 결과 출력
		System.out.println("A 배열 : " + Arrays.toString(a));
		System.out.println("B 배열 : " + Arrays.toString(b));
	}
}