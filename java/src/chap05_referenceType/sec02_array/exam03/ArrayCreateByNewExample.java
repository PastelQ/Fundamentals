package chap05_referenceType.sec02_array.exam03;

// new 연산자로 배열 생성
public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// 인트 타입 배열
		int[] arr1 = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "]" + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "]" + arr1[i]);
		}
		
		// 실수 타입 배열
		double[] arr2 = new double[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "]" + arr2[i]);
		}
		
		// 스트링 타입 배열
		String[] arr3 = new String[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "]" + arr3[i]);
		}
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "]" + arr3[i]);
		}
	}
}
