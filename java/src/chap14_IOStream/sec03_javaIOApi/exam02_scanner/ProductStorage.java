package chap14_IOStream.sec03_javaIOApi.exam02_scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Scanner 클래스
 - 해당 클래스는 입출력 / 보조 스트림이 아니나, 문자 파일이나 바이트 기반 입력 스트림에서
  라인 단위 문자열을 쉽게 읽도록 하기 위해 java.util패키지에서 제공하는 클래스
 - System.in 필드로 라인 단위로 읽기 위해 여러가지 보조 스트림(characterConvert, buffered)을 연결
  했었으나, Scanner 클래스를 이용하면 보조 스트림 연결 없이 쉽게 라인 단위 문자열을 읽을 수 있음(nextLine() 사용) */

/** 상품 정보를 Scanner로 키보드로 입력 받아 Product 객체 생성 및 List 컬렉션에서 관리 **/
public class ProductStorage {
	
	// Field
	private List<Product> list = new ArrayList<>();		// List 컬렉션 생성
	private Scanner scanner = new Scanner(System.in);   // 키보드 입력 Scanner 생성
	private int counter; 								// pno 제공 카운터
	
	/** Scanner로 입력 받기 및 목록 선택 시 해당 메서드를 호출 **/
	public void showMenu() {
		while(true) {
			System.out.println("-------------------------");
			System.out.println("1.등록  |  2.목록  |  3.종료");
			System.out.println("-------------------------");
			
			System.out.print("선택 : ");
			// 목록의 번호를 읽고 해당 메서드 호출
			String selectNo = scanner.nextLine();
			
			switch(selectNo) {
				case "1" : registerProduct();	// 상품 등록 메서드 호출
					break;
				
				case "2" : showProducts();		// 상품 조회 메서드 호출
					break;
			
				case "3" : return;				// 프로그램 종료
			}
		}
	}
	
	/** 상품 등록 메서드 **/
	public void registerProduct() {
		try {
			// Product 클래스 인스턴스 생성
			Product product = new Product();
			product.setPno(++counter); // 상품 번호
			
			System.out.print("상품명 : ");
			product.setName(scanner.nextLine());  // 입력된 이름을 읽고 세팅
			
			System.out.print("가격 : ");
			product.setPrice(Integer.parseInt(scanner.nextLine())); // 입력된 가격을 읽고 세팅
			
			System.out.print("재고 : ");
			product.setStock(Integer.parseInt(scanner.nextLine())); // 입력된 재고를 읽고 세팅
			
			// list에 세팅된 product 저장
			list.add(product);
			
		} catch(Exception e) {
			System.out.println("등록 에러 : " + e.getMessage());
		}
	}
	
	/** 상품 조회 메서드 **/
	public void showProducts() {
		for(Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" +
						 	   p.getPrice() + "\t" + p.getStock());
		}
	}
}