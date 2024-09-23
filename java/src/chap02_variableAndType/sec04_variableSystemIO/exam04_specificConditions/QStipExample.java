package chap02_variableAndType.sec04_variableSystemIO.exam04_specificConditions;

// 'q'를 입력하여 반복 종료시키는 키코드 프로그램
public class QStipExample {

	public static void main(String[] args) throws Exception{

		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
			
			// ASCII-113 : q
			if(keyCode == 113) {
				break;
			}
		}
		
		System.out.println("종료됨");
	}
}