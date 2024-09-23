package chap11_basicJavaAPI.sec01_javalangPackage.exam19_toLowerUpperCase;

// 알파벳 소,대문자 변경(toLowerCase(), toUpperCase())
// String 클래스의 두 메서드는 각각 문자열을 모두 소문자 혹은 대문자로 바꾼 새로운 문자열을 생성 후 리턴
/* replace()와 동일하게 원본의 문자열이 수정된 것이 아닌 완전히 새로운 문자열을 생성해서 리턴함
 * 주로 영어로 된 두 문자열을 대소문자와 관계 없이 비교할 때 주로 이용됨
 * 추가로 equalsIgnoreCase()를 이용하면 두 문자열이 대소문자를 무시하고 동일 여부에 따라 true/false 반환 */
public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		String str2 = "JAVA PROGRAMMING";
		
		// 대소문자가 달라 false 출력
		System.out.println(str1.equals(str2));
		
		// str1,2 문자열을 소문자로 생성 후 리턴
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		// 모두 소문자로 맞춘 lowerStr1,2는 문자열이 같아 true 출력
		System.out.println(lowerStr1.equals(lowerStr2));
		
		// equalsIgnoreCase()를 통해 대소문자를 무시하고 문자열만 비교
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}