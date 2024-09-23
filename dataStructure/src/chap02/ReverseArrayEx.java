package chap02;

import java.util.Arrays;
import java.util.Scanner;

// ReverseArray.java와 같이 작성하되 역순으로 정렬하는 과정을 출력하는 프로그램 작성
public class ReverseArrayEx {
	
	//swap() : 배열 a[]를 받아, 배열 요소 a[idx1]과 a[idx2]의 값을 바꾸는 메서드
	static void swap(int[] a, int idx1, int idx2) {
		// swap 작업할 변수 t 선언
		System.out.println("a["+idx1+"]와 a["+idx2+"]를 교환합니다.");
		int t = idx1;
		idx1 = idx2;
		idx2 = t;
		System.out.println("변경된 내용 : " + Arrays.toString(a));
	}
	
	// reverse() : swap()를 호출해 배열 a의 요소를 역순으로 정렬해주는 메서드
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length-i-1);
		}
	}
	
	// 실행 메서드
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);	// 스캐너
		int num;								// 요솟수(길이)을 담은 변수
		
		// 배열 요솟수 지정
		System.out.println("배열의 요솟수(길이)를 지정해주세요.");
		num = stdIn.nextInt();
		
		// 요솟값 크기의 int 배열 arr 생성 및 요소 값 입력 받기
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			System.out.println("arr["+i+"] : ");
			arr[i] = stdIn.nextInt();
		}
		
		// reverse()로 역순 정렬
		reverse(arr);
		
		System.out.println("\n정렬된 값은 아래와 같습니다.\n" + Arrays.toString(arr));
	}
}