package chap11_basicJavaAPI.sec02_javautilPackage.finalTest;

import java.util.Calendar;

//확인 문제 : Calendar 클래스를 이용해 오늘의 날짜를 출력하는 프로그램
public class CalendarExample {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY:
				strWeek="월";
				break;
			case Calendar.TUESDAY:
				strWeek="화";
				break;
			case Calendar.WEDNESDAY:
				strWeek="수";
				break;
			case Calendar.THURSDAY:
				strWeek="목";
				break;
			case Calendar.FRIDAY:
				strWeek="금";
				break;
			case Calendar.SATURDAY:
				strWeek="토";
				break;
			default:
				strWeek="일";
				break;
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초");
	}
}
