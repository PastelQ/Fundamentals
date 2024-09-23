package chap11_basicJavaAPI.sec01_javalangPackage.finalTest04;

/* 확인 문제 : 문자열 str에서 "자바" 문자열이 포함되어 있는 지 확인하고 "자바"를 "Java"로
   대치한 새로운 문자열 만들어 보기 */
public class FindAndReplaceExample {

	public static void main(String[] args) {
		
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		// 해당 문자열 검색
		int index = str.indexOf("자바");
		
		// indexOf로 검색되지 않으면 -1을 반환하는 특성으로 포함 여부 확인
		if(index == -1) {
			System.out.println("\"자바\" 문자열이 포함되어 있지 않습니다.");
		} else {
			System.out.println("\"자바\" 문자열이 포함되어 있습니다.");
			str = str.replace("자바", "Java");
		}
		System.out.println(str);
	}
}