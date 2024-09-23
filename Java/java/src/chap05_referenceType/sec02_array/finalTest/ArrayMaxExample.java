package chap05_referenceType.sec02_array.finalTest;

// for문을 사용하여 현재 배열의 최댓값 구하기
public class ArrayMaxExample {
	
	public static void main(String[] args) {
		
		int max = 0; // 최댓값을 저장할 변수
		int[] array = {1, 5, 3, 2, 4};
		
		for(int i=0; i<array.length; i++) {
			if(max<=array[i]) {
				max = array[i];
			}
		}
		System.out.println("max : " + max);
	}
}