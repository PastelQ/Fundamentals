package chap01;

public class Max3Method {
	//a, b, c의 최댓값을 구해 반환
	static int max3(int a, int b, int c) {
		
		//최댓값
		int max = a; 
		
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// 세 값의 대소 관계 : 경우의 수 13가지
		System.out.println("max3(3,2,1) = " + max3(3,2,1));
		System.out.println("max3(3,2,2) = " + max3(3,2,2));
		System.out.println("max3(3,1,2) = " + max3(3,1,2));
		System.out.println("max3(3,2,3) = " + max3(3,2,3));
		System.out.println("max3(2,1,3) = " + max3(2,1,3));
		System.out.println("max3(3,3,2) = " + max3(3,3,2));
		System.out.println("max3(3,3,3) = " + max3(3,3,3));
		System.out.println("max3(2,2,3) = " + max3(2,2,3));
		System.out.println("max3(2,3,1) = " + max3(2,3,1));
		System.out.println("max3(2,3,2) = " + max3(2,3,2));
		System.out.println("max3(1,3,2) = " + max3(1,3,2));
		System.out.println("max3(2,3,3) = " + max3(2,3,3));
		System.out.println("max3(1,2,3) = " + max3(1,2,3));
	}
}
