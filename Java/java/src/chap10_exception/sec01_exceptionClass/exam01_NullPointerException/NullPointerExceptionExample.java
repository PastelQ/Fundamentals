package chap10_exception.sec01_exceptionClass.exam01_NullPointerException;

import chap09_nasted.sec01_nastedClassAndInterface.exam01_nastedClass.Main;

// NullPointerException : 객체 참조가 없는 상태(null)의 참조 변수로 객체 접근 연산자인 도트(.)를
// 사용할 경우 예외 발생(객체가 없는 상태에서 객체를 사용하려 함)
public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// data 변수 null 초기화
		String data = null;
		// 컴파일 에러는 나지 않지만 data에는 객체 참조가 없는 상태로 실행 예외(Runtime Exception)가 발생
		System.out.println(data.toString());
	}
}
/* 콘솔에 예외 메세지 출력
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "data" is null
at chap10_exception.sec01_exceptionClass.exam01_NullPointerException.NullPointerExceptionExample.main(NullPointerExceptionExample.java:13)

어떤 예외가 어떤 소스의 몇 번째 코드에서 발생했는지 정보가 들어있음
*/