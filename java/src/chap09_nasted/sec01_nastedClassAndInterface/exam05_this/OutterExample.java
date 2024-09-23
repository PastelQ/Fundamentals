package chap09_nasted.sec01_nastedClassAndInterface.exam05_this;

// 복습 : 중첩 클래스에서 바깥 클래스 참조 얻기 

/** 실행 클래스로 확인 **/
public class OutterExample {
	
	public static void main(String[] args) {
		// 인스턴스 생성
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested(); // 중첩 클래스(인스턴스 멤버 클래스) 생성
		
		nested.print();
	}
}
/*
중첩 클래스 : 클래스 내부 선언된 클래스
- 두 클래스의 멤버들을 서로 쉽게 접근할 수 있고 외부엔 불필요한 관계 클래스를 감춤
- 2가지로 분류 멤버 클래스(클래스 멤버로 선언되는 중첩 클래스) / 로컬클래스(생성자, 메서드 내부에서 선언되는 중첩 클래스)

* 멤버 클래스
1. 인스턴스 멤버 클래스 (A객체를 생성해야 사용할 수 있는 B클래스)
2. A 클래스로 바로 접근이 가능한 B 클래스)

* 로컬 클래스
- method가 실행될 때만 사용할 수 있는 B 클래스
 */