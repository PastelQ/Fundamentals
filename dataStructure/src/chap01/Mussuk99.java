package chap01;

import java.util.Scanner;

public class Mussuk99 {

	public static void main(String[] args) {
		
		Scanner mussuk = new Scanner(System.in);
		int person;
		
		// 양수 유효성 검사
		do {
			System.out.println("사람 수 입력 : ");
			person = mussuk.nextByte();
		} while (person < 0 || person > 100);
		
		int pizza = 6;		// 피자는 6조각 씩
		int totalPizza = 1; // 피자 판 수
		int piece = pizza;  // 초기 피자 조각 수
		
		while(piece % person != 0) {
			totalPizza++;
			piece = pizza * totalPizza;
		}
		System.out.println("필요 피자 수 : "+ totalPizza);
		System.out.println("한 명당 이만쿰 먹어 : "+piece/person);
	}
}

