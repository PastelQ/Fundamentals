package chap02;

import java.util.Arrays;

// 배열의 복제
class CloneArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = a.clone(); // b는 a의 복제를 참조
		
		// 복제한 b 인덱스 3 요소에만 0 대입
		b[3] = 0;
		
		System.out.println("a = " + Arrays.toString(a));	// 1, 2, 3, 4, 5
		System.out.println("b = " + Arrays.toString(b));	// 1, 2, 3, 0, 5
	}
}