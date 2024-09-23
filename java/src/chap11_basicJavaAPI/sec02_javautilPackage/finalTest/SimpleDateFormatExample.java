package chap11_basicJavaAPI.sec02_javautilPackage.finalTest;

import java.util.Date;
import java.text.SimpleDateFormat;

// 확인 문제 : Date와 SimpleDateFormat 클래스를 이용해 오늘의 날짜를 출력하는 프로그램
public class SimpleDateFormatExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		
		System.out.println(sdf.format(now));
	}
}