package chap07_inheritance.sec01_inheritance.exam03_overriding;

// 메서드 재정의(Overriding) Test
public class ComputerExample {

	public static void main(String[] args) {
		
		int r = 10;
		
		// 상위 클래스 인스턴스 생성
		Calculator cal = new Calculator();
		System.out.println("원면적 : " + cal.areaCircle(r));
		System.out.println();
		
		
		// 하위 클래스 인스턴스 생성(Override한 메서드 출력)
		Computer com = new Computer();
		System.out.println("원면적 : " + com.areaCircle(r));
	}
}