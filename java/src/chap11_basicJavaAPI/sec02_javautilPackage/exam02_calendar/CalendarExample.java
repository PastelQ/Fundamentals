package chap11_basicJavaAPI.sec02_javautilPackage.exam02_calendar;

import java.util.Calendar;

// 운영 체제의 시간대를 기준으로 Calendar 얻기
/* Calendar : 운영체제의 날짜와 시간을 얻을 때 사용
 - 달력을 표현한 클래스, 해당 운영 체제의 Calendar 객체를 얻으면, 연도, 월, 일, 시간 등의 정보를 얻을 수 있음
 - Calendar 클래스는 Abstract Class로 new 연산자를 이용하여 인스턴스를 생성할 수 없음
  > Calendar 클래스의 static 메서드인 getInstance()를 이용하여 현재 운영체제에 설정되어 있는 시간대(TimeZone)을
    기준으로 Calendar의 하위 객체를 얻을 수 있음
 - Calendar 객체를 얻은 후 get()를 통해 날짜와 시간에 대한 정보 읽어들일 수 있음 */
public class CalendarExample {

	public static void main(String[] args) {
		
		// getInstance()를 통해 현재 운영체제에 설정된 시간대와 로케일을 기준으로 적절한 Calendar 하위 객체를 반환
		Calendar now = Calendar.getInstance();
		
		// 하위 객체 어떤 것으로 반환 받았는 지 확인 : java.util.GregorianCalendar
		String calendarObjectName = now.getClass().getName();
		System.out.println(calendarObjectName);
		
		// get()를 통해 날짜와 시간에 대한 정보 얻기 (Calendar 클래스에서 정의된 상수 반환)
		// 연,월,일,주,요일 얻기
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // 월은 0부터 시작하여 1을 더해줌
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null; // 요일을 넣을 String 변수 초기화
		
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "월";
				break;
			case Calendar.TUESDAY:
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "수";
				break;
			case Calendar.THURSDAY:
				strWeek = "목";
				break;
			case Calendar.FRIDAY:
				strWeek = "금";
				break;
			case Calendar.SATURDAY:
				strWeek = "토";
				break;
			case Calendar.SUNDAY:
				strWeek = "일";
				break;
		}
		
		// 오전 오후 얻기
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null; // 오전 오후 문자열을 담을 변수 초기화
		
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		// 시,분,초 얻기
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		
		/** 출력 **/
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");
	}
}