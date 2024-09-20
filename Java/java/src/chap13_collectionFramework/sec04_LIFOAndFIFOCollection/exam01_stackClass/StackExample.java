package chap13_collectionFramework.sec04_LIFOAndFIFOCollection.exam01_stackClass;

import java.util.Stack;

/** Stack을 이용한 동전 케이스(LIFO) **/
public class StackExample {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<>();
		
		// 동전을 끼움
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		
		while(!coinBox.isEmpty()) { // 동전 케이스가 비었는 지 확인
			// pop() : 가장 위의 객체 꺼냄(동전 케이스에서 제일 위의 동전을 꺼냄)
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
		// 결과 : 50, 100, 50, 100 -> 나중에 넣은 것부터 순차적으로 출력
	}
}