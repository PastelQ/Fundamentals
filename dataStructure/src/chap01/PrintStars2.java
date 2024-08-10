package chap01;

import java.util.Scanner;

// PrintStars1.java를 개선 
// *을 n개 출력하되 w개 마다 줄 바꿈
public class PrintStars2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		// 변수 n : *의 갯수
		// 변수 w : 줄 바꿈이 실행되는 갯수
		int n,w;
		
		// n이 0 이하일 경우 다시 입력
		do {
			System.out.println("n의 값 : ");
			n = stdIn.nextInt();
		} while (n<=0);
		
		// w이 0 이하일 경우, w가 n보다 클 경우 다시 입력
		do {
			System.out.println("w의 값 : ");
			w = stdIn.nextInt();
		} while (w<=0 || w>n);
		//----------PrintStars1.java와 상기 동일------------
		
		// n / w 번 실행하는 for문
		for(int i=0; i<n/w; i++) {
			System.out.println("*".repeat(w)); // *을 w개씩 출력 후 줄바꿈
		}
		
		// 배수가 아닐 경우(나머지가 있을 경우)
		int rest = n % w; // 해당 변수에 나머지를 담음
		if(rest != 0) {
			System.out.println("*".repeat(rest)); // rest만큼 출력 후 줄바꿈
		}
	}
}
// * repeat 메서드 : (내용.repeat(횟수)) > String 클래스의 메서드 / 내용을 횟수만큼 반복