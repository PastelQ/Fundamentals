package chap11_basicJavaAPI.sec01_javalangPackage.exam20_trim;

// 문자열 앞뒤 공백 제거(trim())
/* String 클래스의 trim()은 문자열의 앞 뒤 공백을 제거한 새로운 문자열을 생성 후 리턴
  ! 주의 : 앞 뒤의 공백만 제거할 뿐 중간의 공백은 제거하지 않음 */
public class StringTrimExample {

	public static void main(String[] args) {
		
		String tel1 = "  02";
		String tel2 = "123   ";
		String tel3 = "  1234   ";
		
		// 좌우 공백을 제거한 tel1,2,3 문자열을 합친 값을 대입
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}
}