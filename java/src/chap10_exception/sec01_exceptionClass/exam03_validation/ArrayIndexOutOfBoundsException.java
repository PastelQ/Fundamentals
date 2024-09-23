package chap10_exception.sec01_exceptionClass.exam03_validation;

// exam02와 동일하게 args의 인덱스를 확인
/* 단 이 클래스에는 배열값을 읽기 전에 배열의 길이를 먼저 조사(유효성 검사)를 진행하여 실행 매개값이 없거나
   부족할 경우 조건문을 이용하여 사용자에게 알려줄 수 있는 프로그램 */
public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// If 문을 통해 args의 길이가 2와 동일한 지 비교
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]:" + args[0]);
			System.out.println("args[1]:" + args[1]);
		} else { // 아닐 경우 아래 메시지를 출력하여 실행 예외를 발생시키지 않음
			System.out.println("두 개의 실행 매개값이 필요합니다.");
		}
	}
}