package chap10_exception.sec01_exceptionClass.exam02_ArrayIndexOutOfBoundsException;

// ArrayIndexOutOfBoundsException(실행 예외) : 배열에서 인덱스 범위를 초과할 경우
public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		// main 메서드의 매개변수 String[] args의 0,1 인덱스를 각각 data1,2에 담음
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0]:" + data1);
		System.out.println("args[1]:" + data2);
/* 예외 발생
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
at chap10_exception.sec01_exceptionClass.exam02_ArrayIndexOutOfBoundsException.ArrayIndexOutOfBoundsExceptionExample.main(ArrayIndexOutOfBoundsExceptionExample.java:8)
*/
		// 현재 args에 매개값을 주지 않았기 때문에 [0], [1] 등 인덱스를 사용할 수 없음
		// * Run Configurations에서 Arguments를 입력하면 예외 발생 X
	}
}