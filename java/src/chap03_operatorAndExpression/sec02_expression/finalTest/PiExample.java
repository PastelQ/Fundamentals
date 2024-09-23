package chap03_operatorAndExpression.sec02_expression.finalTest;

// 반지름이 10인 원 넓이를 구하기
public class PiExample {

	public static void main(String[] args) {

		int var1 = 10;
		int var2 = 3;
		int var3 = 14;

		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		
		System.out.println(var4);
	}
}