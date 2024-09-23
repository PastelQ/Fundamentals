package chap04_conditionalStatementAndLoop.sec02_loop.exam10_continue;

// Continue를 사용한 for문 : 1~10까지 짝수를 출력하는 프로그램
// continue문은 현재 반복문의 이후 문장을 실행하지 않고 다음 반복으로 넘어감
// for문의 증감식 or while문,do-while문의 조건식으로 이동
public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i =1; i<=10; i++) {
			// 2로 나눈 나머지가 0이 아닐 경우(홀수) 컨티뉴문 실행
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
