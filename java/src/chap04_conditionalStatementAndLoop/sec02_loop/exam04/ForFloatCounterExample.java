package chap04_conditionalStatementAndLoop.sec02_loop.exam04;

// float 타입 카운터 변수
public class ForFloatCounterExample {

	public static void main(String[] args) {
		
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
		// 이론적으로는 해당 for문은 10번이 실행되어야 하나
		// 0.1f는 float 타입으로 0.1보다 약간 더 큰 값으로 9번만 수행됨
	}
}