package chap07_inheritance.sec01_inheritance.exam01_class;

// 자식 클래스 사용
public class DmbCellPhoneExample {
	//실행 메서드
	public static void main(String[] args) {
		
		// 자식 클래스(DmbCellPhone) 인스턴스 생성
		DmbCellPhone dmb = new DmbCellPhone("자바폰", "검정", 10);
		
		
		// Field 확인
		// 부모 클래스에게 상속 받은 필드(CellPhone)
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);

		// 자식 클래스 자체 필드(DmbCellPhone)
		System.out.println("채널 : " + dmb.channel);
		
		
		// Method 확인
		// 부모 클래스에게 상속 받은 메서드
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요.");
		dmb.receiveVoice("안녕하세요!:");
		dmb.hangUp();
		
		// 자식 클래스 자체 메서드
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();
	}
}