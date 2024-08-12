package chap02;

import java.util.Scanner;

// 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드 작성
public class SumOf {
	
	static int sum(int[] a) {
		// sum : 합계를 담을 변수
		int sum = 0;
		
		// 매개변수로 받은 a[]를 반복문으로 요소들을 더함 
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		// 구한 합계를 반환
		return sum;
	}
	
	// 실행 메서드
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수 입력 : ");
		int num = stdIn.nextInt();	// num : 요솟수를 담을 변수
		
		// num으로 받은 요솟수 크기의 배열 생성
		int[] a = new int[num];
		
		//요소 값 받기
		System.out.println("값을 입력해주세요.");
		for(int i=0; i<num; i++) {
			System.out.println("a["+i+"] : ");
			a[i] = stdIn.nextInt();
		}
		
		// sum()를 사용하여 출력
		System.out.println("결과는 "+sum(a)+"입니다.");
	}

}
