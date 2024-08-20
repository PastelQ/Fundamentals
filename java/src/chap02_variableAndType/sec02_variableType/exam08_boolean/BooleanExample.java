package chap02_variableAndType.sec02_variableType.exam08_boolean;

// boolean 타입(논리 타입)
// 참과 거지슬 의미하는 논리 리터럴로 true, false 사용
public class BooleanExample {

	public static void main(String[] args) {
		
		// false로 저장할 경우 하기 if 문 else 부분 출력
		boolean stop = true;
		
		if(stop) {
			System.out.println("중지합니다");
		} else {
			System.out.println("시작합니다");
		}
	}
}
