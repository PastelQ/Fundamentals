package chap06_class.sec03_constructor.exam02;

// 생성자에서 필드 초기화
// 생성자에서 정의한 매개변수를 통해 전달되고 이 값들을 각각 해당 클래스의 필드 초기값으로 이용
public class Korean {
	
	// 필드 : nation은 필드 선언하면서 초기값을 준 상태
	// 나머지 name, ssn은 매개변수로 받아 초기값으로 이용
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 생성자
	public Korean(String n, String s) {
		// 선언된 name, ssn에 매개변수 n, s의 값을 대입
		name = n;
		ssn = s;
	}
}
	/* 심화 : 일반적으로 매개변수는 필드와 동일한 이름을 갖는 매개 변수를 사용
	 -> 다만 필드와 매개 변수 이름이 동일할 경우 생성자 내부에서 필드에 접근할 수 없음(매개 변수가 사용 우선 순위가 높기 때문)
	 이럴 경우 this.(객체 자신의 참조)를 사용
	 
	 public Korean(String name, String ssn){
	 	this.name = name;
	 	this.ssn = ssn;
	 }
	 
	 위의 생성자 예시를 상기 주석 예시로 바꿀 수 있음
	 this.name : 필드
	 name 	   : 매개 변수
	*/