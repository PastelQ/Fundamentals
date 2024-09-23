package chap02_variableAndType.sec02_variableType.exam03_long;

// long 타입 변수
public class LongExample {
	
	public static void main(String[] args) {
		
		long var1 = 10;
		long var2 = 20L;
		// long var3 = 10000000000000; -> 컴파일 에러
		long var4 = 10000000000000L;
	}
}

// long 타입 변수에는 정수 리터럴이 int 타입의 허용 범위를 초과하면
// 대문자 'L'을 정수 리터럴 뒤에 붙임