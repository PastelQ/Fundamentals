package chap06_class.sec05_instanceStaticMember.finalTest;

// ShopService 객체를 싱글톤으로 얻을 수 있도록 클래스 작성
public class ShopService {

	// 1. 해당 클래스 타입의 필드로 인스턴스 생성
	// private : 외부 접근 제한 (캡슐화, 은닉화)
	// static  : 클래스가 로딩될 때 한 번만 초기화되며 클래스의 모든 인스턴스가 동일한 shopService 객체 공유
	private static ShopService shopService = new ShopService();
	
	// 2. 생성자 접근제한자 private로 접근 제한
	private ShopService() {	}
	
	// 3. getInstance() 메서드 생성 후 필드 반환
	static ShopService getInstance() {
		return shopService;
	}
}