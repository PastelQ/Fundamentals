package chap10_exception.sec02_exceptionHandling.exam02_runtimeExceptionHandling;

// 실행 예외 처리 : 컴파일러가 예외 처리 코드를 체크하지 않아 빨간 줄로 표시되지 않음
public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		
		try { // try : 메인 메서드의 매개변수로 받은 인덱스 0,1을 data1,2에 대입
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) { // catch : 매개값의 수가 부족할 경우 실행 예외(ArrayIndexOutOfBoundsException)
			System.out.println("실행 매개값의 수가 부족합니다.");
		}
		
		try { // 매개값으로 받은 수를 정수로 변환하여 value1,2에 저장
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch(NumberFormatException e) { // catch : 변환이 어려울 경우 실행 예외(NumberFormatException)
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally { // finally : 예외와 상관 없이 무조건 실행될 블록
			System.out.println("다시 실행하세요.");
		}
	}
}