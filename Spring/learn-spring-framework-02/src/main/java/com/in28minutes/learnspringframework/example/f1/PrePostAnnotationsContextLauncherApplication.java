package com.in28minutes.learnspringframework.example.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/* @PostConstruct
 - 초기화를 하기 위해 의존성 주입이 완료 후 실행해야 하는 메서드에 사용 */
/* @PreDestroy
 - 컨테이너에서 인스턴스를 삭제하는 과정 중에 있음을 알려주는 콜백 알림
 - 보유하고 있던 리소스를 해제하는 데 일반적으로 사용 */

@Component
class SomeClass{
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("모든 의존성 준비 완료");
	}
	
	// 의존성 주입이 완료된 후 자동으로 호출
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	
	// 애플리케이션 종료 전 자동으로 해당 메서드 호출
	@PreDestroy // 일반적으로 보유하고 있던 리소스를 해제하는 데 사용
	public void cleanup() {
		System.out.println("Cleanup");
	}
}

@Component
class SomeDependency{
	
	public void getReady() {
		System.out.println("Some logic using SomeDependency");
	}
}

@Configuration
@ComponentScan 
public class PrePostAnnotationsContextLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(PrePostAnnotationsContextLauncherApplication.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}
	}
}