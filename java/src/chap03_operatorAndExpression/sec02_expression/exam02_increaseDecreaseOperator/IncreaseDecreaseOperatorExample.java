package chap03_operatorAndExpression.sec02_expression.exam02_increaseDecreaseOperator;

// 증감 연산자(++, --..etc) : 변수의 값을 1 증감 
// ! 주의 : 증감 연산자는 변수 앞뒤 어디든 올 수 있으며 연산식에서 증감 연산자만 사용된다면 위치는 상관 없음
// 		 -> ++i / i++ 두 개의 값은 동일
// ! 주의 : 다른 연산자와 함께 사용될 경우 증감 연산자의 위치에 따라 값 "다름!!!"
//		 -> 변수 앞일 경우(i++) : 우선 변수값을 증감한 후에 다른 연산자를 처리
//		 -> 변수 뒤일 경우(i++) : 다른 연산자를 먼저 처리한 후 변수 값을 증감
public class IncreaseDecreaseOperatorExample {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		// 단일로 사용했을 때는 동일
		System.out.println("-----------------------");
		x++;
		++x;
		System.out.println("x = " + x); // 12
		
		
		System.out.println("-----------------------");
		y--;
		--y;
		System.out.println("y = " + y); // 8
		
		// 변수 뒤에 증감
		System.out.println("-----------------------");
		z = x++;
		System.out.println("z = " + z); // 12 : ++가 적용되기 전의 값을 저장함
		System.out.println("x = " + x); // 13
		
		// 변수 앞에 증감
		System.out.println("-----------------------");
		z = ++x;
		System.out.println("z = " + z); // 14 : ++가 적용되고 = 연산자가 실행되어 증감이 된 상태로 저장
		System.out.println("x = " + x); // 14
		
		
		System.out.println("-----------------------");
		z = ++x + y++;
		System.out.println("z = "+ z);  // 15+8(연산이 끝나고 증감이 이뤄짐)=23
		System.out.println("x = "+ x);  // 15
		System.out.println("y = "+ y);  // 9
	}
}
