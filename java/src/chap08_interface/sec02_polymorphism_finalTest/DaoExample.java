package chap08_interface.sec02_polymorphism_finalTest;

// 실행 클래스에서 dbWork()를 호출할 때 OracleDao, MySqlDao 객체를 매개값으로 주고 호출
// 두 매개값으로 받기 위해 DataAccessObject 타입의 매개 변수를 가지고 있음.
// 실행 결과를 토대로 나머지 코드 작성
public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	// 실행 메서드
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}