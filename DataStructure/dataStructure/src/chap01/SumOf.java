package chap01;

import java.util.Scanner;

public class SumOf {

	static int sumof(int a, int b) {
		
		int high = a;	// 큰 수
		int low = 0;	// 작은 수
		int sum = 0;	// 연산된 수 
		
		// 분기점 1 : a < b
		if(a < b) {
			high = b;
			low = a;
			
		// 분기점 2 : a == b
		} else if(a == b) {
			low = a;
			System.out.println("같은 수를 입력하였습니다. 입력한 수를 반환합니다.");
			
		// 분기점 3 : b > a
		} else {
			low = b;
		}
		
		// 반복문
		for(int i=low; i<=high; i++) {
			sum += i;
		}
		return sum; // 연산된 값 반환
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수 2개를 입력해주세요.");
		
		System.out.println("a의 값을 입력해 주세요.");
		int a = stdIn.nextInt();
		
		System.out.println("b의 값을 입력해 주세요.");
		int b = stdIn.nextInt();
		
		System.out.println("결과는 "+sumof(a,b)+" 입니다.");
		
	}
}
