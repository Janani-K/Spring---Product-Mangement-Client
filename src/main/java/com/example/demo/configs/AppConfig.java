package com.example.demo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.example.demo.clients.ProductClient;

@Configuration
public class AppConfig {

	@Bean
	public ProductClient client() {
		return new ProductClient();
	}
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
