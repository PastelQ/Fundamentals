package chap11_basicJavaAPI.sec01_javalangPackage.exam17_replace;

// 문자열 대치(replace()) 
// 첫번째 매개값인 문자열을 찾아 두번째 매개값인 문자열로 대치한 새로운 문자열을 생성하고 리턴
/* 주의 : String 객체의 문자열은 변경이 불가한 특성을 가지기 때문에 
		replace()가 리턴하는 문자열은 원래의 문자열의 수정본이 아닌 "완전히 새로운 문자열" */
public class StringReplaceExample {

	public static void main(String[] args) {
		
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		// "자바"라는 문자열을 "JAVA"로 replace
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}