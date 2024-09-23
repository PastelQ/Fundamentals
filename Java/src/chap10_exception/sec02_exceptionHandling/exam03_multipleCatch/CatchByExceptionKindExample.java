package chap10_exception.sec02_exceptionHandling.exam03_multipleCatch;

// 예외 종류에 따른 처리 코드 
// 다중 catch(Multiple catch) : try 블럭 내부에 다양한 예외가 발생할 경우 발생되는 예외 별로 예외 처리 코드를 다르게 설정할 수 있음 
public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		
		// try : 예외 발생 예상되는 블럭
		try {
			// args 인덱스 0,1을 data1,2에 대입
			String data1 = args[0];
			String data2 = args[1];
			
			// 해당 data1,2를 정수(int) 타입으로 변경하여 value1,2로 대입
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data1);
			
			int result = value1 + value2;
			System.out.println(data1+ " + " + data2 + " = " + result);
		// catch(예상되는 예외명, 변수) : 예상되는 예외가 발생할 경우 실행되는 블럭 
		// 다중 캐치문으로 "ArrayIndexOutOfBoundsException", "NumberFormatException" 두 개의 캐치블럭 작성
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		// finally : 예외와 상관 없이 무조건 실행되야 할 블럭
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}