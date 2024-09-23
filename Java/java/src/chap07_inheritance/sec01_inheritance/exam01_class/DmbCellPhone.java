package chap07_inheritance.sec01_inheritance.exam01_class;

// 자식 클래스에 해당
public class DmbCellPhone extends CellPhone{

	// field
	int channel;
	
	// constructor
	DmbCellPhone(String model, String color, int channel){
		this.model = model;		// 상위클래스(CellPhone)에게 상속받은 필드
		this.color = color;		// 상위클래스(CellPhone)에게 상속받은 필드
		this.channel = channel;
	}
	
	// method
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널이 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 중단합니다");
	}
}