package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Spring이 관리하는 에너테이션 (빈 관리)
public class HelloWorldConfiguration {

	@Bean // 반환하는 객체를 Spring 컨테이너에 Bean으로 등록 (!메서드 선에서 사용)
	public String name() {
		return "Ranga";
	}
}
