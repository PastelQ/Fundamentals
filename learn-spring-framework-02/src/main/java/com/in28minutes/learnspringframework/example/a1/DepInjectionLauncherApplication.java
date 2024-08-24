package com.in28minutes.learnspringframework.example.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
	// 의존성 주입하는 3개 (필드 주입, Setter 주입, 생성자 주입)
	// 1.필드 의존성 주입 : setter 및 생성자 X
	//@Autowired
	Dependency1 dependency1;
	
	//@Autowired
	Dependency2 dependency2;
	
	// 2. Setter 메서드 주입
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter 메서드 주입 - setDependency1");
//		this.dependency1 = dependency1;
//	}
//	
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter 메서드 주입 - setDependency2");
//		this.dependency2 = dependency2;
//	}
	
	// 3. 생성자로 의존성 주입(가장 추천) - 생성자가 하나일 경우 @Autowired 에너테이션 없이도 의존성 주입됨(단, 기본 생성자는 필드 주입 필요) 
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("생성자 주입 - YourBusinessClass");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	
	public String toString() {
		return "Using " + dependency1 +  " and " + dependency2;
	}
}

@Component
class Dependency1{
	
}

@Component
class Dependency2{
	
}

@Configuration
@ComponentScan // ("패키지명 명시 안할 경우 현재 패키지에서 스캔")
public class DepInjectionLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(DepInjectionLauncherApplication.class)){
			
			// 스프링 애플리케이션 컨텍스트에서 정의된 빈의 이름을 가져와서 각각의 빈 이름을 콘솔에 출력하는 기능
			/* context.getBeanDefinitionNames() : ApplicationContext의 객체 . 스프링 컨테이너에 정의된 모든 빈의 이름을 문자열 배열로 반환
			 Arrays.stream() : 배열을 스트림으로 변환 (데이터를 처리하는 일련의 연산을 가능하게 하는 기능)
			 forEach() : 스트림의 각 요소에 대해 주어진 작업 시작 / System.out::println : 메서드 참조로 스트림 각 요소를 println 출력 */
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(YourBusinessClass.class));
		}
	}
}