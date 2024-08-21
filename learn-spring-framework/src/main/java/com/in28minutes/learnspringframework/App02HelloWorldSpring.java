package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// SpringFW를 사용하여 애플리케이션을 설정하고 실행하는 과정 진행
		// 1. Spring App 혹은 Spring Context를 시작(실행) 
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		// AnnotationConfigApplicationContext
		// Spring 컨테이너를 초기화하고, 설정 클래스를 로드하여 애플리케이션에 필요한 Bean들을 관리
		
		
		// 2. Spring FW가 관리할 객체 설정하기
		// HelloWorldConfiguration에 @Configuration 사용
		// name 메서드에 @Bean 사용
		
		// 3. Spring이 관리하는 Bean들을 검색(메서드 명으로 검색)\
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));
	}
}
