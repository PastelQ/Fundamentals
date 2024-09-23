package chap02;

import java.util.Scanner;

// 입력 받은 10진수를 2진수~36진수로 기수 변환하여 출력
public class CardConv {
	// 정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어 두고 자릿수 반환
	static int cardConv(int x, int r, char[] d) {
		// 변환 후의 자릿수
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// r로 나눈 나머지를 저장
		do {
			d[digits++] = dchar.charAt(x%r);
			x /= r;
		} while (x != 0);
		
		// 배열 d의 숫자 문자열을 역순으로 정렬
		for (int i =0; i<digits/2; i++) {
			char t = d[i];
			d[i] = d[digits-i-1];
			d[digits-i-1] = t; 
		}
		
		return digits;
	}
	
	// 실행 클래스
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int no; 					// 변환할 정수
		int cd;						// 기수 (진법의 밑(base)를 의미 : n진수로 할 것인지)
		int dno;					// 변환 후의 자릿수
		int retry;					// 프로그램 재시작 여부 사용
		char[] cno = new char[36];	// 변환 후 각 자리의 숫자를 넣어 두는 문자 배열
		
		System.out.println("10진수를 기수 변환합니다.");
		do { // 다시 시작을 희망할 경우 진행하도록 설정한 반복문
			do { // 입력 받은 수가 양수인 지 검사
				System.out.println("변환할 양수 : ");
				no = stdIn.nextInt();
			} while(no < 0);
			
			do { // 어떤 진수로 변환할 지 cd(기수) 입력 받고 2~36까지의 수인 지 검사
				System.out.println("어떤 진수로 변환할까요? (2~36)");
				cd = stdIn.nextInt();
			} while(cd<2 || cd>36);
			
			dno = cardConv(no, cd, cno); // no를 cd진수로 변환
			
			System.out.print(cd + "진수로 ");
			for (int i = 0; i<dno; i++) {
				// 배열에 저장되어 있는 char를 for문으로 이어붙임
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.println("다시 한 번 할까요? (1.예 / 0.아니오)");
			retry = stdIn.nextInt();
		} while (retry == 1); 
		System.out.println("종료됩니다");
	}
}
