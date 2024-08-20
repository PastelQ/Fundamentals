package chap02_variableAndType.sec02_variableType.exam07_floatAndDouble;

// float와 double 타입 (실수 타입)
public class FloatDoubleExample {

	public static void main(String[] args) {
		
		// 실수 값 저장
		// float var1 = 3.14; -> float 타입은 리터럴 뒤에 f,F를 붙여 명시해야 함
		float var2 = 3.14f;
		double var3 = 3.14;
		
		// 정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789; // float 타입보다 정밀도가 2배 정도 높음
		
		System.out.println("var2:"+var2);
		System.out.println("var3:"+var3);
		System.out.println("var4:"+var4);
		System.out.println("var5:"+var5);
		
		
		// e 사용하기
		double var6 = 3e6;
		float var7 = 3e6f;
		double var8 = 2e-3;
		
		System.out.println("var6:"+var6);
		System.out.println("var7:"+var7);
		System.out.println("var8:"+var8);
	}
}
