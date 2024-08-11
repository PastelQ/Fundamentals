package chap02_variable.sec01_variable.exam03;

// 변수값 교환
public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		// 변수 하나를 추가하여 또 다른 변수에 대입하여 값을 복사 
		// 하기에서는 값을 x는 y로, y는 x로 변경(교환)
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}
}
