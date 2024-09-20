package chap11_basicJavaAPI.sec01_javalangPackage.exam18_substring;

// 문자열 잘라내기(추출하기 / substring())
/* String 클래스의 substring()은 주어진 인덱스에서 문자열을 추출하며 아래 2가지로 사용됨
 1. substring(int beginIndex, int endIndex) // 시작,끝 인덱스를 지정하여 그 사이 문자열 추출
 2. substring(int beginIndex)				// 시작 인덱스로부터 끝까지 문자열 추출 */
public class StringSubstringExample {
	
	public static void main(String[] args) {
		
		String ssn = "880815-1234567";
		
		// 1번째 방식으로 시작,끝 인덱스를 지정하여 사이 문자열 추출
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		// 2번째 방식으로 시작 인덱스를 지정하여 끝까지 문자열 추출
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}