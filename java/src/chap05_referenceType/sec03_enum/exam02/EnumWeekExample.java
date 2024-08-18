package chap05_referenceType.sec03_enum.exam02;

import java.util.Calendar;

import chap05_referenceType.sec03_enum.exam01.Week;

// 열거 타입과 열거 상수
public class EnumWeekExample {

	public static void main(String[] args) {
		
		// 열거 타입 변수 선언, null로 우선 초기화
		Week today = null;
		// java.util의 캘린더 클래스 사용 : Calendar -> 컴퓨터의 날짜 및 요일, 시간을 얻을 수 있음
		Calendar cal = Calendar.getInstance();	 // 추상클래스로 직접 인스턴스화가 아닌 getInstance()로 Calendar 객체 얻음
		int week= cal.get(Calendar.DAY_OF_WEEK); // 일(1)~토(7)까지의 숫자를 리턴
		
		// cal.get(Calendar.DAY_OF_WEEK)를 통해 오늘 일자를 반환 받아 today에 대입
		switch(week) {
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
}
