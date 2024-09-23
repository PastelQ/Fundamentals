package chap02;

import java.util.Arrays;
import java.util.Scanner;

// 배열 요소에 값을 읽어 들여 역순으로 정렬
public class ReverseArray {
	
	// swap() : 배열 a[]를 받아, 배열 요소 a[idx1]과 a[idx2]의 값을 바꾸는 메서드
	static void swap(int[] a, int idx1, int idx2) {
		// t : 값 하나를 보관할 작업용 변수
		int t = a[idx1];      // t <- x
		a[idx1] = a[idx2];	  // x <- y
		a[idx2] = t;		  // y <- t
	}
	
	// reverse() : 배열 a의 요소를 역순으로 정렬해주는 메서드
	static void reverse(int[] a) {
		// 역순으로 바꿀 시 나머지 1은 버림 -> 중간 값은 바꿀 필요 없기 때문에
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length-i-1);
		}
	}
	
	// 실행 메서드
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = stdIn.nextInt(); 			   // 요솟수(배열의 길이) 입력 받기
		
		int[] x = new int[num];				   // 요솟수가 num인 배열
		
		for(int i=0; i<num; i++) {			   // 배열 요소(값) 입력 받기
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		// 비교를 위해 처음 입력한 그대로의 배열도 남겨 두기
		int[] basic = new int[x.length];
		// 반복문을 이용하여 x의 요소(값)을 복사
		for (int i=0; i<basic.length; i++) {
			basic[i] = x[i]; 
		}
		
		// 역순 변경하는 메서드(reverse) 진행
		reverse(x);
		
		System.out.println("요소가 역순으로 정렬되었습니다.");
		System.out.println("reverse 전 x : " + Arrays.toString(basic));
		System.out.println("reverse 후 x : " + Arrays.toString(x));
	}
}
