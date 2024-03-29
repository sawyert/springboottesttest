package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class DemoConfiguration {
	@Bean
	public DemoBean demoBean() {
		return new RealDemoBeanImpl();
	}

}
