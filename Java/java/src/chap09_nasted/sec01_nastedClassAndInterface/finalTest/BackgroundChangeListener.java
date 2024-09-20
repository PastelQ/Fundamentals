package chap09_nasted.sec01_nastedClassAndInterface.finalTest;

/** CheckBox클래스의 정적 멤버 인터페이스 구현 클래스 **/
public class BackgroundChangeListener implements CheckBox.OnSelectListener {

	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다.");
	}
}