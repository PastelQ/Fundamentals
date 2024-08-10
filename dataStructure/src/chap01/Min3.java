package chap01;

// 연습 문제 1-2 세 값의 최솟값을 구하는 메서드 구하기
public class Min3 {
	
	static int min3(int a, int b, int c) {
		int min = a;
		
		if(a>b) {
			min = b;
		}
		if(b>c) {
			min = c;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("min3(3,5,1) = "+min3(3,5,1));
	}
}
