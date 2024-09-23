package chap13_collectionFramework.sec02_setCollection.finalTest;

/** hashCode(), equals() 재정의 **/
public class Student {

	public int studentNum; // 학번
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	// 재정의
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return studentNum==student.studentNum;
		}
		return false;
	}
}