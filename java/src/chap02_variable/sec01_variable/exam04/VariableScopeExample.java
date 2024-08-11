package chap02_variable.sec01_variable.exam04;

// 변수의 사용 범위
public class VariableScopeExample {

	public static void main(String[] args) {
		// v1 변수 선언
		int v1 = 15;
		
		if(v1 > 10) {
			int v2;
			v2 = v1- 10;
		}
		
		// 지역 변수인 v2는 블록 범위를 넘으면 사용할 수 없는 점 확인, 하기 컴파일 에러 발생 
		// int v3 = v1 + v2 + 5;
	}
}
