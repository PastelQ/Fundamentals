package com.in28minutes.learnspringframework.example.e1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 프로토타입 및 싱글톤
/* 차이점
 * 일반 클래스(싱글톤) : 
  - 기본적으로 Spring Framework에서 생성되는 모든 Bean들은 싱글톤
  - Spring IoC 컨테이너 당 객체 인스턴스가 단 하나
 * 프로토 타입 : 
  - 매번 Spring Context에서 새로운 Bean을 가져옴(싱글톤과 반대)
  - Spring IoC 컨테이너에 여러 개의 인스턴스 생성 가능
 */

// 싱글톤 : 빈을 요청할 때마다 같은 인스턴스 반환
@Component
class NormalClass {
}

// @Scope를 통해 프로토타입 클래스 명시
// 프로토타입 : 빈을 참조할 때마다 매번 다른 인스턴스를 생성하고 싶을 경우 사용
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {
}

@Configuration
@ComponentScan 
public class BeanScopesLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(BeanScopesLauncherApplication.class)){
			
			// 노말클래스의 반환되는 인스턴스는 항상 같음
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));

			// 프로토 타입 클래스의 반환되는 인스턴스는 매번 다름
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			
		}
	}
}

// 그 밖의 Scope (웹 어플리케이션)
/* Request : HTTP 요청 당 객체 인스턴스 하나가 생성
 * Session : 사용자 HTTP 세션 당 객체 인스턴스 하나가 생성
 * Application : 웹 애플리케이션 전체에 객체 인스턴스 하나
 * Websocket : 웹소켓 인스턴스 당 객체 인스턴스 하나
*/