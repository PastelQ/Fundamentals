package com.in28minutes.learnspringframework.example.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// @Component
@Repository // 빈이 DB와 통신하는 경우, 데이터 저장 및 검색,조작하는 경우 사용 
public class MySqlDbDataService implements DataService{

	@Override
	public int[] retrieveData() {
		return new int[] { 11,22,33,44,55 };
	}
}