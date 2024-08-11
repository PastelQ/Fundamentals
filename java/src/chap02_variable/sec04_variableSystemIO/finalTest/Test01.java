package chap02_variable.sec04_variableSystemIO.finalTest;

// 다음과 같이 출력되도록 코드 작성
/* 출력 내용
이름 : 김자바
나이 : 25
전화 : 010-123-4567
 */
public class Test01 {

	public static void main(String[] args) {
		
		String name = "김자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		
		System.out.println("이름 : " + name);
		System.out.print("나이 : " + age + "\n");
		System.out.printf("전화 : %1$s-%2$s-%3$s",tel1,tel2,tel3);
		// 순번 명시가 필요 없긴 하나 n$로 순번도 함께 명시
	}
}