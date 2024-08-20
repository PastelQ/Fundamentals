package chap02_variableAndType.sec04_variableSystemIO.exam02_keyCode;

// 입력된 키코드를 변수에 저장
// 입력 스트림 System.in의 read() 자바의 표준 입력을 읽어 옴
public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("KeyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("KeyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("KeyCode: " + keyCode);
	}
}
/* 출력 코드 : 97, 13, 10
 - read()는 키보드로 입력된 모든 문자를 한 번에 한 문자씩 읽음 (ASCII 아스키코드)
  1. a를 첫번째로 눌러 a키에 대한 ASCII-97 출력
  2. 엔터의 경우 2개의 키코드로 구성
   - Carriage Return(CR) : 커서를 현재 줄의 맨 앞으로 이동 ASCII-13 출력
   - Line Feed(LF)		 : 커서를 다음 줄로 이동 ASCII-10 출력
*/