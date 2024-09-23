package chap11_basicJavaAPI.sec02_javautilPackage.exam01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

// java.util Package : 프로그램 개발 시 자주 사용되는 자료구조일 뿐 아니라 날짜 정보를 제공해주는 유용한 API 포함
/* Date : 날짜와 시간 정보를 저장하는 클래스
  - 특정 시점의 날짜를 표현하는 클래스, Date 객체 안에는 특정 시점의 연도, 월, 일, 시간 정보가 저장
  - 객체 간 날짜 정보를 주고 받을 때 매개변수 혹은 리턴 타입으로 주로 사용됨
 * Calendar : 운영체제의 날짜와 시간을 얻을 때 사용
  - 달력을 표현한 클래스, 해당 운영 체제의 Calendar 객체를 얻으면, 연도, 월, 일, 시간 등의 정보를 얻을 수 있음 */
public class DateExample {

	public static void main(String[] args) {
		
		// Date 클래스로 인스턴스 생성
		Date now = new Date();
		// Date에서 재정의된 toString의 경우 영문으로 된 날짜를 리턴
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		// java.text 패키지의 SimpleDateFormat : 원하는 형식의 날짜 정보를 얻을 수 있음
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); // 인수로 원하는 형식(문자열)
		String strNow2 = sdf.format(now); // 참조변수.format(Date 객체) : 원하는 형식의 날짜 정보를 문자열로 반환
		System.out.println(strNow2);
	}
}