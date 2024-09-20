package com.in28minutes.learnspringframework.example.c1;

import java.util.Arrays;

import org.springframework.stereotype.Service;

// @Component
@Service // 어노테이션한 클래스에 비즈니스 논리가 있을 경우 서비스를 사용
public class BusinessCalculationService {

	private DataService dataService;
	
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}