package chap08_interface.sec02_polymorphism.finalTest;

// DataAccessObject Interface 구현 클래스
public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("MySql DB에서 입력");
	}

	@Override
	public void update() {
		System.out.println("MySql DB에서 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}
}