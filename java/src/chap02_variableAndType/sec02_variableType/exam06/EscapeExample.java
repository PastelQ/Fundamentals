package chap02_variableAndType.sec02_variableType.exam06;

// 이스케이프 문자 출력
// 문자열 내부에 역슬래시(\)를 사용할 수 있는데, 문자열 내부에 특정 문자를 포함할 수 있음
public class EscapeExample {
	
	public static void main(String[] args) {
		
		// \t : tab 만큼 띄움
		System.out.println("번호\t이름\t직업");
		
		// \n : 줄바꿈(라인 피드)
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		
		// \' , \"  : 작은 따옴표, 큰 따옴표 출력
		System.out.println("우리는\"개발자\"입니다");
		
		// \\ : 역슬래시(\) 출력
		System.out.println("봄\\여름\\가을\\겨울");
	}
}
