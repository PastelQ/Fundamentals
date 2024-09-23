package chap11_basicJavaAPI.sec01_javalangPackage.exam04_toString;

import java.util.Date;

// toString() : Object의 메서드로 객체의 문자 정보 리턴
/* Object의 toString() 메서드 리턴값은 자바 Application에선 크게 의미가 없는 정보임에
 (Object의 toString() : '클래스이름@16진수 HashCode'로 구성된 문자정보 리턴)
 Object 하위 클래스는 toString()를 재정의해 간결하고 유익한 정보를 리턴하게 되어 있음 */
public class ToStringExample {

	public static void main(String[] args) {
		
		Object obj1 = new Object(); // toString(Object obj1) -> '클래스이름@16진수 HashCode'로 구성된 문자정보 리턴
		Date obj2 = new Date();		// toStirng(Date obj2) -> 날짜, 시간 정보 리턴(ex.Wed Aug 28 12:03:05 KST 2024)
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}