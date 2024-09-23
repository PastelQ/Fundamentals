package chap02_variableAndType.sec02_variableType.exam04_char;

// char 타입 변수
// 문자리터럴 : 1개의 문자를 작은 따옴표로 감싼 것 -> 유니코드로 변환되어 저장됨
public class CharExample {

	public static void main(String[] args) {
		
		char c1 = 'A';			// 문자 직접 저장
		char c2 = 65;			// 10진수로 저장
		char c3 = '\u0041';		// 16진수로 저장
		
		char c4 = '가';			// 문자 직접 저장
		char c5 = 44032;		// 10진수로 저장
		char c6 = '\uac00';		// 16진수로 저장
	
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}
}
