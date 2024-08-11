package chap02_variable.sec03_typeConversion.exam06;

// 문자열 결합 연산 : + 연산자는 합, 연결 2가지의 기능을 가지고 있음(문자열의 경우 연결)
// 2개의 피연산자가 있을 때 하나라도 문자열일 경우에는 나머지 피연산자도 문자열로 자동 변환되어 결합 연산 수행
/* 예시 1
 int value = 3+7;       -> 10;
 String str = "3" + 7;  -> 37;
 String str = 3 + "7";  -> 37; */

// 연산식에서 + 연산자가 연이어 나올 경우 앞에서부터 순차적으로 +연산을 수행
// 먼저 수행된 연산이 덧셈 연산이라면 덧셈 결과를 가지고 그 다음 + 연산을 수행
/* 예시 2
  String str = 1+2+"3"; -> 3 + "3" -> 33; */
public class StringConcatExample {
	
	public static void main(String[] args) {
		
		// 숫자 연산
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		// 문자열 결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1); // 128
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2); // 1028
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3); // 1028
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4: " + str4); // 1010
	}
}