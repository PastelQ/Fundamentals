package chap11_basicJavaAPI.sec01_javalangPackage.exam15_indexOf;

// 문자열 포함 여부 조사(indexOf("찾는 문자열"))
// String 클래스의 indexOf()는 매개값으로 주어진 문자열이 시작되는 인덱스를 리턴
// * 주어진 문자열이 포함되어 있지 않을 경우 -1을 반환
// 주로 if문의 조건식에서 특정 문자열이 포함되어 있는 지 여부에 따라 실행 코드를 달리할 때 자주 사용
public class StringIndexOfExample {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		
		// 변수 location의 문자열이 시작되는 인덱스 리턴
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		// "자바" 문자열이 미포함(-1 반환되는 경우)이 아닐 경우를 판단하는 if문 
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련이 없는 책이군요.");
		}
	}
}