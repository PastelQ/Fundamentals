package com.in28minutes.learnspringframework.example.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;

// Java Spring XML 설정 알아보기
// Java 설정에서 수행한 작업은 XML 설정에서도 모두 가능
public class XmlConfigurationContextLauncherApplication {
	
	public static void main(String[] args) {
		
		// contextConfiguration.xml을 사용해 컨텍스트를 실행
		try(var context = 
				new ClassPathXmlApplicationContext("contextConfiguration.xml")){
		
		// xml에 정의된 모든 Bean 출력
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		context.getBean(GameRunner.class).run();
		}
	}
}