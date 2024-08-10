package chap01;

//연습 문제 1-4 세 값의 중앙값을 구하는 메서드 만들기
public class Med3 {

	static int med3(int a, int b, int c) {
		int med = a;
		
		if(a >= b) {
			if(b >= c) {
				med = b;
			} else if (c >= a) {
				med = a;
			} else {
				med = c;
			}
		} else if (a > c) {
			med = a;
		} else if (b > c) {
			med = c;
		} else {
			med = b;
		}
		return med;
	}
	
	// 실행 클래스
	public static void main(String[] args) {
		System.out.println("med3(3,2,1) 값은 : "+med3(3,2,1));
		// 나머지 12개의 경우의 수는 생략 (세 값의 대소 관계 13가지 조합 중..)
	}
}
