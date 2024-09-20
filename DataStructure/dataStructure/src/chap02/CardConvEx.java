package chap02;

import java.util.Scanner;

// 기수 변환 과정을 자세히 나타내는 프로그램 작성
public class CardConvEx {
	
	// 10진수 -> 기수 변환 메서드 여기서 각 자리의 숫자를 배열 인덱스로 담음
	/* a : 입력 받은 정수
	 * b : 기수
	 * c : 변환 후에 각 자리의 숫자를 넣어두는 문자 배열 (e에서 charAt으로 뽑아 씀)
	 */
	static int cardConv(int a, int b, char[] c) {
		
		int d = 0;	// d : 자릿수(배열의 길이)
		String e = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";	// e : 사용될 문자열
		
		do {// 인덱스 0(첫자리) 부터 채우기
			c[d++] = e.charAt(a%b);	// 나머지가 해당되는 문자를 e에서 가져옴
			a /= b;
		} while(a!=0);
		
		// 자릿수를 역순으로 만들어줄 반복문
		for(int i=0; i<d/2; i++) {
			char t = c[i];		// 변경하는데 도와줄 변수 t
			c[i] = c[d-i-1];
			c[d-i-1] = t;
		}
		return d;
	}
	
	// 실행 클래스
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int no;		// 입력 받을 정수
		int cd; 	// 기수(n진수로 할 건지)
		int dno;	// 변환 후 자릿수(cardConv()를 통해 받는 배열의 길이)
		int retry;	// Retry 변수
		char[] cno = new char[36];	// 변환 후 각 자리 숫자를 넣어 두는 문자 배열
		
		do { // Retry 반복문
			do { // no가 양수인지 검사
				System.out.println("10진수를 기수 변환합니다.");
				System.out.println("변환하는 양수 : ");
				no = stdIn.nextInt();
			} while(no <= 0);
			
			do { // cd가 2~36의 수인지 검사
			System.out.println("어떤 진수로 변환할까요?(2~36) : ");
			cd = stdIn.nextInt();
			} while (cd<=2 || cd>=36);
			
			// cardConv()를 통해 기수 변환
			dno = cardConv(no, cd, cno);
			
			// 출력 부분
			System.out.print(cd + "진수로 ");
			for(int i=0; i<=dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println(" 입니다.");
			System.out.println("다시 한 번 할까요? (1.예 / 0.아니오)");
			retry = stdIn.nextInt();
		} while(retry == 1);
	}
}
