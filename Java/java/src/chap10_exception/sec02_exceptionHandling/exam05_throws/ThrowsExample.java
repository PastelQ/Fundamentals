package chap10_exception.sec02_exceptionHandling.exam05_throws;

// throws : 메서드 선언부 끝에 작성되어 메서드에서 처리하지 않은 예외를 호출한 곳으로 떠넘김
// throws 키워드 뒤에는 떠넘길 예외 클래스를 쉼표로 구분해서 나열
/* 문법
 리턴타입 메서드명(매개변수) throws 예외클래스1, 예외클래스2, ... 예외클래스n{ 실행 내용 }
*/
public class ThrowsExample {

	public static void main(String[] args) {
		// 호출한 곳에서 처리
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	// throws 키워드를 이용하여 호출한 곳으로 예외 처리를 던짐
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
}
