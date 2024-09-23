package chap13_collectionFramework.sec04_LIFOAndFIFOCollection.exam02_queueInterface;

/* Queue Interface : FIFO 자료구조에서 사용되는 메서드 정의
 - Queue를 구현한 대표적인 클래스는 LinkedList 
 즉, LinkedList는 Queue 인터페이스를 구현하고, List 인터페이스도 구현해 List 컬렉션이기도 함 */
/** Message 클래스 **/
public class Message {

	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}