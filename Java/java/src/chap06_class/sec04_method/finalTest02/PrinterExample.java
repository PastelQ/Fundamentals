package chap06_class.sec04_method.finalTest02;

// Printer.java 객체를 생성하여 매개변수를 다르게 주며 호출(오버로딩 연습)
public class PrinterExample {

	public static void main(String[] args) {
		
		// 생성자 호출하여 객체 생성
		Printer printer = new Printer();
		
		// 매개변수 다르게 호출
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}
}