package chap11_basicJavaAPI.sec01_javalangPackage.exam12_charAt;

// String Method : String Class는 문자열의 추출, 비교, 찾기, 분리, 변환 등 다양한 메서드를 가짐
// charAt() : 매개값으로 주어진 인덱스의 문자를 리턴(0에서부터 문자열 길이-1 까지의 번호)

/** String의 charAt()를 통해 ssn에서 남여를 구분하는 프로그램 **/
public class StringCharAtExample {

	public static void main(String[] args) {
		
		// 주민번호 예시
		String ssn = "010624-1230123";
		
		// 7번 인덱스를 추출하여 switch문을 통해 남자와 여자를 구분
		char sex = ssn.charAt(7);
		
		switch(sex) {
			case '1' :
			case '3' :
				System.out.println("남자입니다.");
				break;
			case '2' :
			case '4' :
				System.out.println("여자입니다.");
				break;
		}
	}
}