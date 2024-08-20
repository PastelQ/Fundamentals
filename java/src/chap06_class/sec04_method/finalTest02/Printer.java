package chap06_class.sec04_method.finalTest02;

// Printer 클래스 : (오버로딩) 매개변수 타입을 다르게 받아 출력 
public class Printer {

	// 매개변수 : int
	void println(int n){
		System.out.println(n);
	}
	
	// 매개변수 : boolean
	void println(boolean bool) {
		System.out.println(bool);
	}
	
	// 매개변수 : double
	void println(double doub) {
		System.out.println(doub);
	}
	
	// 매개변수 : String
	void println(String str) {
		System.out.println(str);
	}
}