package chap09_nasted.sec01_nastedClassAndInterface.exam04_localClassAccess;

// 로컬 클래스에서 사용 제한
// 메서드에서 매개 변수와 로컬 변수가 로컬 클래스에서 사용된다면 final의 특성을 가짐(수정 불가)

/** 외부 클래스 **/
public class Outter {
	
	// 자바 7 이전 (이전에는 final을 꼭 명시)
	public void method1(final int arg) {
		
		final int localVariable = 1;
		// arg = 100; 			> final로 변경 불가
		// localVariable = 100; > final로 변경 불가
		
		/** 로컬 클래스 **/
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	// 자바 8 이후
	public void method2(int arg) {
		
		int localVariable = 1;
		
		// arg = 100;			> 로컬 클래스에서 사용된다면 final의 특성을 가짐
		// localVariable = 100; > 로컬 클래스에서 사용된다면 final의 특성을 가짐
		
		/** 로컬 클래스 **/
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}