package chap06_class.sec05_instanceStaticMember.exam04_singleton;

// 싱글톤 객체
public class SingletonExample {
	
	public static void main(String[] args) {
		/* 컴파일 에러 발생 : The constructor Singleton() is not visible
		Singleton obj1 = new Singleton();
		Singleton obj2 = new Singleton();
		*/
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}