package com.in28minutes.learnspringframework.example.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// Spring Bean의 기본 초기화는 즉시 초기화(Eager)
// Bean을 로드하지도 않고 Bean에서 메서드를 호출하지 않아도 자동으로 Bean이 초기화됨.
// -> @Lazy를 사용하면 시작 시 자동 초기화에서 ClassB Bean을 사용할 때 초기화되는 것으로 바꿀 수 있음
// 해당 에너테이션을 사용하면 참조하거나 사용하려 할 때만 초기화가 진행되고 빈이 로드됨
@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		// Logic
		System.out.println("Some Initialization logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Do Something");
	}
}



@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(LazyInitializationLauncherApplication.class)){
			
			System.out.println("컨텍스트 초기화 완료");
			// 클래스B의 doSomething 메서드를 호출시켜 @Lazy로 인해 빈 사용 전에 초기화가 진행되는 지 확인
			context.getBean(ClassB.class).doSomething();
		}
	}
}