package chap02_variableAndType.sec04_variableSystemIO.finalTest;

import java.util.Scanner;

// Scanner를 이용하여 이름, 주민번호 앞 6자리, 전화번호를 입력 받는 프로그램 작성
public class Test03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("성함 : ");
		String name = scan.nextLine();
		
		System.out.println("주민번호 : ");
		String number = scan.nextLine(); 
		
		System.out.println("전화번호 : ");
		String pnum = scan.nextLine();
		
		System.out.println("성함 : " + name + "\n주민번호 : " + number + "\n전화번호 : " + pnum);
		
	}
}

// Trouble Shooting 
/* 주민번호 변수를 받을 때 int type / scan.nextInt(); 를 사용했으나, 전화번호 입력 없이 결과 출력되는 이슈 발생
 
 nextInt()의 경우 입력한 숫자만을 읽어들이나, 입력 시 Enter를 치는 순간 입력 버퍼에 숫자와 함께 줄바꿈 문자인 \n이 남게 됨
 nextInt()는 입력된 숫자만 읽고, \n은 버퍼에 남기는데
 이후 입력된 nextLine()이 버퍼에 남긴 \n을 즉시 읽어들여 이후 전화번호 입력 받는 부분을 빈 문자열로 처리함
 
 ! 결론 : nextInt()는 숫자만 읽고, 줄바꿈 문자는 남겨둠 (해당 부분이 버퍼에 남아 이후 입력 시 바로 읽어들이게 됨)
 		 nextLine()은 줄바꿈 문자를 포함해 전체 라인을 읽음
 		 
  해결 방안 : 줄바꿈 문자가 다음 입력에 영향을 미치지 않도록 하는 방법을 이용해야 함
   Ex01) nextLine()을 한 번 더 사용하여 줄바꿈 문자(\n)를 소모
   Ex02) nextLine()으로 문자열로 받을 경우 버퍼에 \n가 남지 않음
*/
