package chap09_nasted.sec02_anonymousObject.exam04_localVariable;

// 익명 객체의 로컬 변수 사용 : 메서드의 매개 변수나 로컬 변수를 익명 객체 내부에서 사용할 때의 제한
/* 익명 객체가 메서드의 매개변수나 로컬 변수를 사용할 때, 해당 변수들은 메서드가 끝나면 사라지지만 
   익명 객체는 메서드 종료 후에도 실행될 수 있어 익명 객체 내부에서 사용하는 변수의 값이 변경되지 않도록 
   값을 고정(final 선언)해 익명 객체가 메서드 종료 후에도 안전하게 값을 참조하게 함 */
/** 인터페이스 **/
public interface Calculatable {

	public int sum();
}