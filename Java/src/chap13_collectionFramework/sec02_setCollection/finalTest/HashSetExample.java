package chap13_collectionFramework.sec02_setCollection.finalTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/* 확인 문제 : HashSet에서 사용자 정의 객체 저장(hashCode(),equals() 재정의)
 - HasdhSet에 Student 객체를 저장, 학번이 같으면 동일한 Student라고 가정하고 중복 저장이
  되지 않게 hashCode(), equals()를 재정의 */
/** 실행 클래스 **/
public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + " : " + student.name);
		}
	}
}