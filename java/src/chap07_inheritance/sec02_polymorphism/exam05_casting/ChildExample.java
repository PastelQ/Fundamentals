package chap07_inheritance.sec02_polymorphism.exam05_casting;

// 강제 타입 변환(casting) 테스트하기 위한 실행 클래스
public class ChildExample {

	public static void main(String[] args) {
		
		// 자동 타입 변환
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/* Child 클래스에 선언된 필드, 메서드는 사용 불가
		parent.field2 = "data2";
		parent.method3();
		*/
		
		// 강제 타입 변환(casting)하여 자식 클래스에 선언되어 있는 필드, 메서드 사용
		Child child = (Child) parent; 
		child.field2 = "yyy";
		child.method3();
	}
}
