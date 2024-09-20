package chap10_exception.sec01_exceptionClass.exam04_NumberFormatException;

// NumberFormatException(실행 예외) : 숫자로 변환될 수 없는 문자가 포함되어 있을 경우
/* 문자열로 되어 있는 데이터를 숫자등 다른 포맷으로 변경하는 경우가 있는데, 숫자의 경우 'Parse타입() 메서드'를
   이용하여 문자열을 숫자로 변환하여 리턴, 여기서 변환될 수 없는 문자일 경우 해당 실행 예외 발생 */
public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2); // NumberFormatException 발생 ("a100")
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}
}
/* 예외 콘솔 창
Exception in thread "main" java.lang.NumberFormatException: For input string: "a100"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:786)
	at chap10_exception.sec01_exceptionClass.exam04_NumberFormatException.NumberFormatExceptionExample.main(NumberFormatExceptionExample.java:14)
*/