package com.in28minutes.springboot.learn_spring_boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/* application.properties / 애플리케이션 심화 설정
currency-service.url=
currency-service.username=
currency-service.key= */

@ConfigurationProperties(prefix = "currency-service") // prefix = "properties에서 사용할 접두사"
@Component
public class CurrencyServiceConfiguration {

	private String url;
	private String username;
	private String key;
	
	// Getter & Setter
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
}