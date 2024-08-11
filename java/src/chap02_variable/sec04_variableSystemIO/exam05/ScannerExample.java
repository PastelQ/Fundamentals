package chap02_variableAndType.sec04_variableSystemIO.exam05;

import java.util.Scanner;

// 키보드에서 입력된 내용을 문자열로 얻기 : Scanner 클래스 사용
// java.util 패키지의 Scanner를 import 해 문자열을 지정한 변수에 저장
public class ScannerExample {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			System.out.println("문자열을 입력하세요");
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: " + inputData);
			
			// inputData에 담긴 문자열이 "q"일 경우 반복 종료
			if(inputData.equals("q")) {
				break;
			}
		}
		
		System.out.println("종료됨");
	}
}