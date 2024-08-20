package chap05_referenceType.sec01_referenceVariable.exam02_JVMStackArea;

// 간단한 코드로 스택영역에 대해 알아 보기
public class StackAreaExample {

	public static void main(String[] args) {
		
		char v1 = 'A';			// 1
		
		if(v1 == 'A') {			// 2
			int v2 = 100;		// 2
			double v3 = 3.14;	// 2
		}						// 2
		
		boolean v4 = true;		// 3
	}
}
/* JVM 스택은 메서드를 호출할 때마다 프레임을 추가하고 종료되면 제거하는 동작 수행
 - 그 내부에 로컬 변수 스택이 있는데, 기본 타입 변수, 참조 타입 변수가 추가되거나 제거되는 역할도 함
 스택 영역에 변수가 생성되는 시점은 "초기화 될 때" 최초로 값이 변수에 저장될 때
 선언된 블록 안에서만 스택에 존재하고 블록을 벗어나면 스택에서 제거됨

 상기 코드가 스택에 생성되고 소멸되는 과정
 1. 스택영역 : v1 = A
 2. 스택영역 : v1 = A / v2 = 100 / v3 = 3.14	-> if문 블럭이 끝날 경우 소멸
 3. 스택영역 : v1 = A / v4 = true
*/
