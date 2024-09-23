package chap02;

// 배열의 요솟값을 초기화하며 배열 선언하기
// -> 배열 본체의 경우 new 연산자 뿐 아니라 배열 초기화에서도 생성 가능
public class IntArrayInit {

	public static void main(String[] args) {
		//배열 초기화로 인한 생성
		int[] a = {1,2,3,4,5};
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = "+a[i]);
		}
	}
}
