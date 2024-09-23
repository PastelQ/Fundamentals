package chap01;

// 연습 문제 1-1 네 값의 최댓값을 구하는 메서드 구하기
public class Max4 {
	
	static int max4(int a,int b,int c, int d) {
		int max = a;
		
		if(b>a) {
			max = b;
		}
		if(c>b) {
			max = c;
		}
		if(d>c) {
			max = d;
		}
		
		return max;
	}
	

	public static void main(String[] args) {
		System.out.println("max4(1,2,4,3) = "+max4(1,2,4,3));
	}
}
