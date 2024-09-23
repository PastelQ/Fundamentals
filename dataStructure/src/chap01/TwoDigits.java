package chap01;

import java.util.Scanner;

// 2자리의 양수를 입력 받는 프로그램
public class TwoDigits {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 양수를 입력하여라");
		
		// * 10 미만이거나 99 초과일 경우 반복
		do {
			System.out.println("no의 값 : ");
			no = stdIn.nextInt();
		} while (no<10 || no>99);
		
		System.out.println("변수 no값은 "+no+"이 되었습니다.");
	}
}
/* ! 단축평가 (short circuit evaluation) !
 while (no<10 || no>99) 에서 
 no값이 5로 입력될 경우 1번째 평가값이 true이므로 2번째 no>99를 평가할 필요가 없음
 (&&의 경우 반대)
 
 논리 연산의 식 전체를 평가한 결과가 왼쪽 피연산자의 평가 결과만으로 결정되어 오른쪽 피연산자를 평가하지 
 않는 것을 단축 평가라고 함
 
 * ! 드모르간 법칙 !
 (no<10 || no>99) = !(no>=10&&no<=99)
 
 - 각 조건을 부정(!)하고 논리곱(&&)을 논리합(||)으로 바꾼 후에(반대도 가능) 다시 전체를 부정하면
   원래의 조건과 같다
 ex1) x && y = !(!x || !y)
 ex2) x || y = !(!x && !y)
 
 - 위 코드 예시에서 (no<10 || no>99) 의 경우 반복을 계속하는 '계속 조건' 인 반면
   !(no>=10&&no<=99) 의 경우 반복을 종료하는 '종료 조건'의 부정 */