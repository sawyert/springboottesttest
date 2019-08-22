package com.example.demo.test;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.DemoBean;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private DemoBean testDemoBean;

	@Test
	public void testBean() {
		assertFalse("Should pickup test config", this.testDemoBean.getValue());
	}

	@TestConfiguration
	public class DemoTestConfiguration {
		@Bean
		public DemoBean demoBean() {
			return new TestDemoBeanImpl();
		}
	}
}
