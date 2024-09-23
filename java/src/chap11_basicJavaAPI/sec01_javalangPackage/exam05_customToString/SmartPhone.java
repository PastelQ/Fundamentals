package chap11_basicJavaAPI.sec01_javalangPackage.exam05_customToString;

// toString() 커스텀(재정의)하여 유용한 정보 리턴 설정
public class SmartPhone {

	// field
	private String company;
	private String os;
	
	// constructor
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	// method 
	// Object의 toString() 재정의
	@Override
	public String toString() {
		// field인 company, os를 리턴하도록 재정의
		return company + ", " + os;
	}
}