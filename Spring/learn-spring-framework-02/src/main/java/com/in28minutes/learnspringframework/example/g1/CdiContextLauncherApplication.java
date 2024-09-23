package com.in28minutes.learnspringframework.example.g1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

// CDI : Contexts and Dependency Injection
/* Java EE에서 제공하는 의존성 주입 및 컨텍스트 관리의 표준 사양
- 자바 애플리케이션의 모듈화와 결합도를 줄이고 관리하기 쉽게 해줌
- Spring과 유사한 역할을 하지만, Java EE 표준의 일환으로 설계된 점에서 
 차이가 있음 */

//@Component을 대체
@Named
class BusinessService{
	
	public DataService dataService;
	
	// Getter
	public DataService getDataService() {
		return dataService;
	}
	// Setter
	//@Autowired을 대체
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Setter Injection이 사용됨");
		this.dataService = dataService;
	}
}

//@Component을 대체
@Named
class DataService{
}

@Configuration
@ComponentScan 
public class CdiContextLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(CdiContextLauncherApplication.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
			System.out.println(context.getBean(BusinessService.class).getDataService());
		}
	}
}