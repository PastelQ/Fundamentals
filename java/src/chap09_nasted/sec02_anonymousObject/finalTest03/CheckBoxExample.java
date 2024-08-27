package chap09_nasted.sec02_anonymousObject.finalTest03;

// 확인 문제 : 정적 멤버 인터페이스 관련

/** 실행 클래스 **/
public class CheckBoxExample {

	public static void main(String[] args) {
		// CheckBox 클래스 인스턴스 생성
		CheckBox checkBox = new CheckBox();
		
		checkBox.setOnSelectListener(
				// 체크박스의 정적 멤버 인터페이스의 익명 구현 객체 생성 후 인수로 전달
				new CheckBox.OnSelectListener() {
					@Override
					public void onSelect() {
						System.out.println("배경을 변경합니다.");
					}
				});
		// 메서드 호출
		checkBox.select();
	}
}