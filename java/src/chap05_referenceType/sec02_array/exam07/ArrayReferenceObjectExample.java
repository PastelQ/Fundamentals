package chap05_referenceType.sec02_array.exam07;

// 객체를 참조하는 배열(예시 String)
public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		String[] strArray = new String[3];
		strArray[0] = "Java";				// [1]의 "Java" 와 같은 주소를 참조
		strArray[1] = "Java";				// [0]의 "Java" 와 같은 주소를 참조
		strArray[2] = new String("Java");	// new 연산자로 생성하여 [0],[1]과 다른 주소를 참조
		
		System.out.println( strArray[0] == strArray[1] );		// true
		System.out.println( strArray[0] == strArray[2] );		// false
		System.out.println( strArray[0].equals(strArray[2]) );	// true
	}
}
