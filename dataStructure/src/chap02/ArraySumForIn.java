package chap02;

// 확장 For 문
class ArraySumForIn {

	public static void main(String[] args) {
		
		// 일반 for문으로 배열 요소값 구하기
		double[] a = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		
		for (int i=0; i<a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
		
		
		// 확장 For문으로 배열의 총 합 구하기
		double sum = 0;
		
		for (double i : a) 
			sum += i; 
		
		System.out.println("모든 요소의 합은 " + sum + "입니다.");
	}
}