package chap11_basicJavaAPI.sec01_javalangPackage.exam16_length;

// 문자열의 문자 수 얻기 (length())
// String의 length()는 문자열의 길이(문자의 수)를 리턴
public class StringLengthExample {

	public static void main(String[] args) {
		
		String ssn = "7306241230123";
		int length = ssn.length(); // 변수 ssn의 길이
		
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}
}