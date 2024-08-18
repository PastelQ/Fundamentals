package chap05_referenceType.sec02_array.exam09;

// System.arraycopy()를 이용한 배열 복사
/* 문법
 System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 1. src : 원본 배열
 2. srcPos : 원본 배열에서 복사할 항목의 시작 인덱스
 3. dest : 새 배열
 4. destPos : 새 배열에서 붙여넣을 시작 인덱스 
 5. length : 복사할 갯수
 */
public class ArrayCopyExample {

	public static void main(String[] args) {
		
		String[] oldStrArray = { "java", "array", "copy" };	// 구 배열
		String[] newStrArray = new String[5];				// 신 배열
		
		// 구배열의 0 인덱스부터 신배열의 0 인덱스부터 복사, 복사할 길이는 구배열의 길이만큼
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		// java, array, copy, null, null
	}
}