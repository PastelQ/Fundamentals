package chap11_basicJavaAPI.sec01_javalangPackage.finalTest01;

/* 확인 문제 : Student 클래스를 작성하되, Object의 equals(), hashCode()를 재정의해
 Student 클래스의 학번(StudentNum)이 같으면 동등 객체가 될 수 있게 하기
 hashCode()의 리턴값은 studentNum 필드값의 해시코드를 리턴할 것 */
public class Student {

	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	// hashCode() 재정의 : 필드값의 해시코드 반환
	@Override
	public int hashCode() {
		// String 클래스의 hashCode()을 반환
		// 문자열의 문자의 순서, 값을 고려해 해시 값을 생성 / 동일한 문자열에 대해선 동일한 해시값 반환
		return studentNum.hashCode();
	}
	
	// equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.studentNum == student.studentNum) {
				return true;
			}
		}
		return false;
	}
}