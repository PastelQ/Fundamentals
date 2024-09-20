package com.in28minutes.learnspringframework.example.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

// @Component
@Repository // 빈이 DB와 통신하는 경우, 데이터 저장 및 검색,조작하는 경우 사용 
@Primary	// 우선권
public class MongoDbDataService implements DataService{

	@Override
	public int[] retrieveData() {
		return new int[] { 1,2,3,4,5 };
	}
}