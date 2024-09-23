package chap09_nasted.sec02_anonymousObject.exam04_localVariable;

// 익명 객체의 로컬 변수 사용
public class Anonymous {
	// field
	private int field;
	
	// 메서드 내 매개변수, 로컬변수 final은 생략해도 JAVA 8 이후부터는 자동으로 생성
	public void method(final int arg1, int arg2) {
		
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		// arg1 = 20; -> 익명 구현 객체에서 사용될 매개변수는 final
		// arg2 = 20;
		
		// var1 = 30; -> 익명 구현 객체에서 사용될 로컬변수는 final
		// var2 = 30;
		
		// 로컬 변수 값으로 대입(익명 구현 객체 생성)
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}