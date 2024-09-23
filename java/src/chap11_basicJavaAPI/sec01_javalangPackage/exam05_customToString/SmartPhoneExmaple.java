package chap11_basicJavaAPI.sec01_javalangPackage.exam05_customToString;

public class SmartPhoneExmaple {

	public static void main(String[] args) {
		
		// SmartPhone 클래스 인스턴스 생성
		SmartPhone phone = new SmartPhone("구글", "안드로이드");
		
		// 재정의된 toString() 호출
		String strObj = phone.toString();
		
		System.out.println(strObj);
		
		// 해당 방법으로도 toString으로 출력 가능
		// System.out.println()는 "객체"를 출력할 때 toString() 메서드를 자동으로 호출
		// 객체의 toString()가 재정의되었다면 재정의한 정보로 출력할 수 있음
		System.out.println(phone);
	}
}