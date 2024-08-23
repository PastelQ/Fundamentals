package chap08_interface.sec02_polymorphism_finalTest;

// DaoExample에서 사용되는 인터페이스 
public interface DataAccessObject {

	// Abstract method
	void select();
	void insert();
	void update();
	void delete();
}
