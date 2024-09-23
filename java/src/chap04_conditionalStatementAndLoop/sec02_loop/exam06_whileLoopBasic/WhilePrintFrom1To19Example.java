package chap04_conditionalStatementAndLoop.sec02_loop.exam06_whileLoopBasic;

// while 문 1~10까지 출력
public class WhilePrintFrom1To19Example {

	public static void main(String[] args) {
		
		int i = 1;	//초기화
		
		while (i<=10) { // 조건식
			System.out.println(i);
			i++;
		}
	}
}
/* for문 대조

 for(int i=1; i<=10; i++){
 	System.out.println(i)
 }
 
*/