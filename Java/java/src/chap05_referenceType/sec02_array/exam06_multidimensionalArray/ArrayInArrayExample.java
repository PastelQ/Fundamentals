package chap05_referenceType.sec02_array.exam06_multidimensionalArray;

// 배열 속의 배열 : 다차원 배열
// new array[2][3] 일 경우 3개의 배열이 힙영역에 생성되는데 다음과 같음
/* 1. 길이 3짜리 int[] 배열 -> 열
 * 2. 길이 3짜리 int[] 배열	-> 열
 * 3. 길이 2짜리 int[][] 배열 (위 두개를 참조하는 배열) -> 행 */
public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		// 2차원 배열 new 연산자를 이용해 생성
		int[][] mathScores = new int[2][3];
		
		for(int i=0; i<mathScores.length; i++) {
			for(int j=0; j<mathScores[i].length; j++) {
				System.out.println("mathScores[" + i + "][" + j + "]="+mathScores[i][j]);
			}
		}
		System.out.println();
		
		
		// 0행은 길이 2 / 1행은 길이 3의 계단 모양의 배열 생성
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for(int i=0; i<englishScores.length; i++) {
			for(int j=0; j<englishScores[i].length; j++) {
				System.out.println("englishScores[" + i + "][" + j + "]="+englishScores[i][j]);
			}
		}
		System.out.println();
		
		// 상기와 같은 배열이나 값을 입력하여 배열 생성
		int[][] javaScores = { {95,80}, {92,96,80} };
		
		for(int i=0; i<javaScores.length; i++) {
			for(int j=0; j<javaScores[i].length; j++) {
				System.out.println("javaScores[" + i + "][" + j + "]="+javaScores[i][j]);
			}
		}
	}
}
