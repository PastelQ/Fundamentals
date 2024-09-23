package chap09_nasted.sec01_nastedClassAndInterface.exam05_this;

// 중첩 클래스에서 바깥 클래스 참조 얻는 방법
// this : 클래스 내부에선 객체 자신 참조의 의미이나 중첩 클래스 내부에선 중첩 클래스 자체 객체 참조
// 바깥 클래스 호출 시 : 바깥 클래스명.this.필드/메서드()

/** 외부 클래스 **/
public class Outter {
	
	// Outter의 필드, 메서드
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	/** 중첩 클래스(인스턴스 멤버 클래스) **/
	class Nested {
		// Nested의 필드, 메서드
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			// Nested의 필드, 메서드 호출(this 키워드 사용) - 중첩 객체 참조
			System.out.println(this.field);
			this.method();
			// Outter의 필드, 메서드 호출(바깥 클래스명.this 키워드 사용) - 바깥 객체 참조
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}

}
