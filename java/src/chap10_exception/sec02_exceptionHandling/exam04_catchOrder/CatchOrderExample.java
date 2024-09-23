package chap10_exception.sec02_exceptionHandling.exam04_catchOrder;

// Multiple Catch문에서 주의할 점 : Catch 블럭의 순서 (상위 예외 클래스가 하위 예외 클래스보다 아래 위치)
/* catch 블럭은 위에서부터 차례대로 검색되는데 상위 예외 클래스의 
 catch 블럭이 위에 있을 경우 하위 예외 클래스 catch 블럭은 실행되지 않음
 하위 예외는 상위 예외를 상속했기 때문에 상위 예위 타입도 되어 
 하위 예외가 되어 있는 부분은 어떤 경우에도 실행되지 않게 됨
*/
public class CatchOrderExample {

	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(value1 + " + " + value2 + " = " + result);
		// 다중 catch 블럭 순서 ( 상위 예외 클래스가 아래에 )
		// 하위 예외 클래스(ArrayIndexOutOfBoundsException)
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		// 상위 예외 클래스(Exception)
		} catch(Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}