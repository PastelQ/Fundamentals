package chap01;

// 연습 문제 1-3 네 값의 최솟값을 구하는 메서드 구하기
public class Min4 {
	
	static int min4(int a, int b, int c,int d) {
		int min = a;
		
		if(a>b) {
			min = b;
		}
		if(b>c) {
			min = c;
		}
		if(c>d) {
			min = d;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("min3(2,3,1,4) = "+min4(2,3,1,4));
	}
}
