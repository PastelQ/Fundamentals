package com.in28minutes.learnspringframework.example.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan 
public class RealWorldSpringContextLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(RealWorldSpringContextLauncherApplication.class)){
			
			// 스프링 애플리케이션 컨텍스트에서 정의된 빈의 이름을 가져와서 각각의 빈 이름을 콘솔에 출력하는 기능
			/* context.getBeanDefinitionNames() : ApplicationContext의 객체 . 스프링 컨테이너에 정의된 모든 빈의 이름을 문자열 배열로 반환
			 Arrays.stream() : 배열을 스트림으로 변환 (데이터를 처리하는 일련의 연산을 가능하게 하는 기능)
			 forEach() : 스트림의 각 요소에 대해 주어진 작업 시작 / System.out::println : 메서드 참조로 스트림 각 요소를 println 출력 */
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
			
		}
	}
}