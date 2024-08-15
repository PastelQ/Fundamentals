package chap03_operator.sec02_expression.finalTest;

import java.util.Scanner;

// ScannerDivision.java를 삼항 연산자를 사용하여 작성
// a/b의 값 출력 (b!=0 || b!=0.0)
public class ScannerDivision2 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		double a,b; // 입력 받을 수
		String result; // 결과값 저장
		
		System.out.println("a 입력 : ");
		a = stdIn.nextDouble();
		
		System.out.println("b 입력 : ");
		b = stdIn.nextDouble();
		
		result = (b==0) ? "결과 : 무한대" : "결과 : " + a/b;
		
		System.out.println(result);
	}
}
/* 오답 노트
 1. b==0.0 | b==0 은 굳이 사용 X : 0, 0.0 둘 중 하나만 사용해도 됨
 2. result를 String 타입으로 선언
 3. 삼항 연산자 false의 경우에서 문자열 + double타입(a/b)이므로 연산 후 자동으로 문자열이 됨 */