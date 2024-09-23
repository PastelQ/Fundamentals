package chap06_class.sec01_oop.finalTest;

// 해당 클래스에서 필드 생성자 메서드 구분
public class Member {
	
	// 필드 : 객체의 데이터가 저장되는 곳 
	// 객체의 고유 데이터, 상태 정보, 부품 객체를 저장
	String name;
	
	// 생성자 : 객체 생성 시 초기화를 담당하며 new 연산자로 호출되는 중괄호({}) 블럭
	// 필드를 초기화하거나 메서드를 호출하여 객체를 사용할 준비
	Member(String name){
	}
	
	// 메서드 : 객체의 동작에 해당하는 중괄호({}) 블럭
	// 객체 간의 데이터를 전달하는 수단이며, 매개값을 받아 실행에 이용 및 호출한 곳으로 리턴 가능
	void setName(String name) {
	}
}