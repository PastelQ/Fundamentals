package chap02;

// 배열의 기본 특성에 대해서 알아보기
public class IntArray {

	public static void main(String[] args) {
		
		// int 타입의 배열을 참조할 수 있는 변수 a 선언  -> 
		// int 형 변수를 5개 모아 만든 배열 생성하여 변수 a에 할당
		int[] a = new int[5]; 
		
		a[1] = 37;			// 인덱스 1에 37 대입
		a[2] = 51;			// 인덱스 2에 51 대입
		a[4] = a[1] * 2;	// 인덱스 4에 인덱스 1 * 2(74)를 대입
		
		// for 반복문으로 각 요솟값을 출력
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
// 결과 
/* a[0] = 0
 * a[1] = 37
 * a[2] = 51
 * a[3] = 0
 * a[4] = 74 
 */