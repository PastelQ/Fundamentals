package chap13_collectionFramework.sec04_LIFOAndFIFOCollection.exam01_stackClass;

/* LIFO(후입선출) / FIFO(선입선출)\
 - 컬렉션 프레임워크에는 LIFO / FIFO 자료구조를 제공하는 Stack 클래스 / Queue 인터페이스를 제공 */
// Stack 클래스 : LIFO 자료구조를 구현한 클래스
/** 동전 케이스를 Stack 클래스로 구현한 예제 **/
public class Coin {

	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}