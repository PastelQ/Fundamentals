package chap02_variableAndType.sec04_variableSystemIO.exam01_printf;

// printf() 메서드 사용 방법
// printf("형식 문자열", 값1, 값2... 값n)

// $[argument_index$(값의 순번)] [flags(빈자리 채우기 -(오른쪽 채우기),0] [width(전체자릿수)] [.precision(소수자리수)] conversion(변환 문자)
public class PrintfExample {

	public static void main(String[] args) {
		
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);			// 정수
		System.out.printf("상품의 가격:%6d원\n", value);		// 6자리 정수 (왼쪽 빈 공백)
		System.out.printf("상품의 가격:%-6d원\n", value);		// 6자리 정수 (오른쪽 빈 공백)
		System.out.printf("상품의 가격:%06d원\n", value);		// 6자리 정수 (왼쪽 공백 0으로 채움)
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area); 
		// 1 : 정수
		// 2 : 전체 길이 10, 소숫점 아래 2자리 (왼쪽 공백)
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job); 
		// 1 : 6자리 정수(왼쪽 공백)
		// 2 : 10자리 문자열(오른쪽 공백)
		// 3 : 10자리 문자열(왼쪽 공백)
		// 그 외 : | 로 구분선 작성
	}
}
