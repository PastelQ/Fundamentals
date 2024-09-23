package chap03_operatorAndExpression.sec02_expression.exam05_charType;

// char 타입의 산술 연산
public class CharOperationExample {

	public static void main(String[] args) {
		
		char c1 = 'A' + 1; // char c1 = 66;으로 컴파일
		char c2 = 'A';
		// char c3 = c2 + 1; -> 컴파일 에러 : char 변수가 산술 연산에서 사용되면 
		// int 타입으로 변환되어 char c3에 담지 못함, 강제형변환이나 결과값을 받는 변수를 int로 바꾸면 해결
		// -> char c3 = (char)(c2 + 1); 강제 형변환 
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
	}
}
