package chap13_collectionFramework.sec03_mapCollection.exam02_overridingHashCodeAndEquals;

// 사용자 지정 키 객체의 hashCode(), equals() 재정의
public class Student {

	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	// 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (sno==(student.sno)) && (name.equals(student.name));
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
}