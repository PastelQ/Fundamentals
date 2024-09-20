package chap11_basicJavaAPI.sec01_javalangPackage.exam25_wrapperCompare;

// 포장 객체 비교 : 내부의 값을 비교하기 위해 equals()를 주로 사용
/* == / != 연산자를 사용할 순 있으나 하기의 범위 안의 값만 비교가 가능
  boolean 		   > { true, false }
  char 	  		   > { \u0000 ~ \u007f }
  byte, short, int > { -128 ~ 127 }
 
 * 이 외의 범위일 경우 하기 2가지로 비교
  1. 직접 내부의 값을 Unboxing 후 비교
  2. equals() 메서드로 내부 값을 비교
   - Wrapper Class의 equals()는 내부의 값을 비교하도록 Overriding 되어 있음 */
public class ValueCompareExample {

	public static void main(String[] args) {
		
		System.out.println("[-128 ~ 127 초과값일 경우]");
		
		// Auto Boxing
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		// == 연산자 사용
		System.out.println("== 결과 : " + (obj1 == obj2)); 		   // false
		// Unboxing 후 == 연산자 사용
		System.out.println("언박싱 후 == 결과 : " + 
							(obj1.intValue() == obj2.intValue())); // true
		// equals() 사용
		System.out.println("equals() 결과 : " + obj1.equals(obj2)); // true
		System.out.println();
		
		//------------------------------------------------------------------
		
		System.out.println("[-128 ~ 127 범위값일 경우]");
		
		//Auto Boxing
		Integer obj3 = 10;
		Integer obj4 = 10;
		
		// == 연산자 사용
		System.out.println("== 결과 : " + (obj3 == obj4));		   // true
		// Unboxing 후 == 연산자 사용
		System.out.println("언박싱 후 == 결과 : " +
							(obj3.intValue() == obj4.intValue())); // true
		// equals() 사용
		System.out.println("equals() 결과 : " + obj3.equals(obj4)); // true
	}
}
/* 궁금증 해결
 Byte, Short, Integer, Character 타입의 경우의 값의 범위가 -127 ~ 128인 이유?
 - 기본 데이터 타입의 범위 Byte, Short, Integer, Character 등은 
  특정 범위의 값을 캐싱하여 메모리 효율성을 높임
 * 캐싱 : 자바에서는 Byte, Short, Integer, Character의 값이 이 범위 내에 있을 경우
         미리 생성된 객체를 재사용. 즉, 같은 값에 대해 동일한 객체를 참조하게 되어
         == 연산자를 사용해도 참조가 같아서 true를 반환
         
 * 범위를 넘는 값 : 이 범위를 넘는 값은 캐싱되지 않기 때문에 새로운 객체가 생성되며,
    			 == 연산자를 사용하면 서로 다른 객체를 비교하게 되어 false를 반환 
    			 
 * 그렇기 때문에 -128 ~ 127 범위 밖의 값이 비교될 경우 범위를 넘는다는 문구 대신 false를 반환 */