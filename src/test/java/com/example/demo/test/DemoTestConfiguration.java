package com.example.demo.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.DemoBean;

@Configuration
@Profile("test")
public class DemoTestConfiguration {
	@Bean
	public DemoBean demoBean() {
		return new TestDemoBeanImpl();
	}
}
