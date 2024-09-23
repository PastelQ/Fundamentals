package chap09_nasted.sec01_nastedClassAndInterface.finalTest;

/** 실행 클래스 **/
public class CheckBoxExample {

	public static void main(String[] args) {
		// 외부 클래스 인스턴스 생성
		CheckBox checkBox = new CheckBox();
		
		// 인수로 구현 클래스의 인스턴스를 넣고 셋메서드 호출
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		checkBox.select();
	}
}