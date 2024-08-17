package chap05_referenceType.sec02_array.exam05;

// main()의 매개변수 String[] args 분석 : 
// 해당 부분은 Run Configuration에서 arguments를 주어 테스트할 수 있음
// String[] 의 경우 명령줄을 인수로 받음
public class MainStringArrayArgument {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);		// 프로그램 강제 종료
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
