package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// record : 불변 데이터 객체를 간단하게 정의해줌 하단 작성
record Person (String name, int age) {};
record Address (String firstLine, String city) {};

@Configuration // Spring이 관리하는 에너테이션 (빈 관리)
public class HelloWorldConfiguration {

	@Bean // 반환하는 객체를 Spring 컨테이너에 Bean으로 등록 (!메서드 선에서 사용)
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person("Ravi", 20);
	}
	
	@Bean
	public Address address() {
		return new Address("Baker Street", "London");
	}
}

/* record Person (String name, int age) {}; 는 하단의 클래스를 정의한 것과 동일

public final class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}
*/