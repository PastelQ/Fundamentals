package chap01;

//연습 문제 1-5 중앙 값을 구하는 메서드는 하기와 동일하게 작성할 수 있는데 효율이 떨어진다. 그 이유는?
public class Med3x {

	static int med3(int a, int b, int c) {
		if((b >= a && c <=a) || (b <= a && c >= a)) {
			return a;
		}else if ((a > b && c < b) || (a < b && c > b)) {
			return b;
		}
		return c;
	}
}
/* 답변 : 여러 조건을 동시에 평가하고, 두 조건을 동시에 검사하기 때문에 불필요한 연산이 추가될 수 있음
		중복된 연산이 추가될 수 있음

static int med3(int a, int b, int c) {
	if (a >= b) {
		if (b >= c) {
			return b;
		} else if (a <= c) {
			return a;
		} else {
			return c;
		}
	} else if (a > c) {
		return a;
	} else if (b > c) {
		return c;
	} else {
		return b;
	}
}
*/