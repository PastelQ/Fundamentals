package chap10_exception.sec02_exceptionHandling.exam01_tryCatch;

// Exception Handling(예외 처리) : 프로그램에서 예외가 발생할 경우 프로그램의 종료를 막고 정상 실행을 유지할 수 있도록 하는 것
// try-catch-finally 블럭 : 
public class TryCatchFinallyExample {
	
	// 존재하지 않는 클래스(String2)를 호출하여 ClassNotFoundException 실행 예외 발생 유도
	public static void main(String[] args) {
		
		// try 블럭 : 예외가 예상되는 코드 작성
		try {
			Class clazz = Class.forName("java.lang.String2");
		// catch 블럭 : 예외가 발생할 경우 실행될 코드 작성	
		} catch(ClassNotFoundException e) { // catch(예외이름 변수명){ 실행 코드 }
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}