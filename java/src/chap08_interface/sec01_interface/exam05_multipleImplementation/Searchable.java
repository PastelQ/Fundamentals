package chap08_interface.sec01_interface.exam05_multipleImplementation;

// 구현 객체는 다수의 인터페이스 타입으로 사용 가능
// 해당 객체는 다수의 인터페이스들에 선언된 추상 메서드를 구현하는 실체 메서드를 모두 선언해야함 
public interface Searchable {

	// method (public abstract)
	void search(String url);
}