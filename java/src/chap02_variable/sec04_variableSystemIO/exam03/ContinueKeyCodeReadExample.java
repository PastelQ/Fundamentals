package chap02_variable.sec04_variableSystemIO.exam03;

// 입력된 키의 갯수와 상관 없이 키코드 읽기
public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		
		int keyCode;
		
		// 조건이 true로 실행시키는 while문으로 직접 강제 종료가 필요함
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}
	}
}