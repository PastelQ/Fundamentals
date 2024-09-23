package chap14_IOStream.sec03_javaIOApi.exam02_scanner;

/** 상품 클래스 **/
public class Product {

	// Field
	private int pno;
	private String name;
	private int price;
	private int stock;
	
	// Constructor : 기본 생성자
	
	// Method : Getter & Setter
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}