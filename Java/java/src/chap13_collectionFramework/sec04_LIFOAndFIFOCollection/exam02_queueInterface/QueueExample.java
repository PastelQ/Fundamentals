package chap13_collectionFramework.sec04_LIFOAndFIFOCollection.exam02_queueInterface;

import java.util.LinkedList;
import java.util.Queue;

/** Queue를 이용한 메시지 큐 **/
public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// offer(object) : 주어진 객체를 넣음
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두깨"));
		
		while(!messageQueue.isEmpty()) { // messageQueue가 비었는 지 확인
			// poll() : Queue에서 1개의 객체 꺼냄(메시지 꺼냄)
			Message message = messageQueue.poll();
			
			switch(message.command) {
				
				case "sendMail" : 
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				
				case "sendSMS" :
					System.out.println(message.to + "님에게 문자를 보냅니다.");
					break;
					
				case "sendKakaotalk" : 
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			}
			
			// 맨 처음 들어간 "홍길동"부터 순차적으로 출력
		}
	}
}