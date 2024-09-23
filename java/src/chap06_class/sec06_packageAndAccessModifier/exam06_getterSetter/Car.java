package chap06_class.sec06_packageAndAccessModifier.exam06_getterSetter;

// Getter & Setter method : 일반적으로 객체의 필드를 객체 외부에서 직접적으로 접근하는 것을 막음
// ? 외부에서 마음대로 변경할 경우 객체의 무결성(결점이 없는 성질)이 깨질 수 있음
// ex) 자동차의 속력은 음수가 될 수 없는데 외부에서 음수로 변경할 경우 무결성이 깨짐
public class Car {

	// field : 외부에서 접근할 수 없게 막음(private)
	private int speed;
	private boolean stop;
	
	// constructor : 명시 X -> 기본 생성자
	
	// method
	/* getter : 외부에서 객체의 데이터를 읽을 때도 필드값을 직접 사용하면 부적절한 경우가 있어 
	   getter 메서드를 사용해 메서드로 필드값을 가공한 후 외부로 전달*/
	public int getSpeed() {
		// 여기서는 사용하지 않았지만 읽어올 때도 get메서드에서 값을 가공하여 리턴도 가능
		return speed;
	}
	
	/* setter : 객체의 무결성을 지키기 위해 매개값을 검증하여 유효한 값만 객체의 필드로 저장할 수
	   있게 도와줌 */
	public void setSpeed(int speed) { // 매개변수로 필드 변경값을 받음
		if(speed < 0) {		 	// 검증
			this.speed = 0;		// 음수일 경우 : 필드값 0으로 저장
		} else {
			this.speed = speed; // 그 외 : 매개변수를 필드값으로 저장
		}
	}
	
	// stop 필드에 대한 getter & setter 메서드
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
