package chap11_basicJavaAPI.sec01_javalangPackage.exam27_random;

// 랜덤값(난수) : double random()  0.0 <= n < 1.0 범위 double 타입 값 리턴 
/* 예시 1~10까지의 정수 중 난수를 얻는 과정
 
  1. 각 변에 10을 곱함
   - 0.0 * 10(0.0) <= Math.random() * 10 < 1.0 * 10(10.0)
   
  2. 각 변을 int 타입으로 강제 타입 변환하면 0 <= n < 10 범위에 속하는 int 타입의 값 얻음
   - (int)(0.0) <= (int)(Math.random() * 10) < (int)(10.0)
   
  3. 각 변에 1을 더해 1<= n < 11 범위에 속하는 정수 값 얻음
   - (0 + 1) <= (int)(Math.random() * 10) + 1 < 10 + 1
 */
public class MathRandomExample {

	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 6) + 1;
		System.out.println("주사위 눈 : " + num);
	}
}