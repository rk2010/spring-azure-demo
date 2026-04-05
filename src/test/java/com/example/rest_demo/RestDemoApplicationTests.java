package com.example.rest_demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;


@SpringBootTest(classes = RestDemoApplication.class)
@ComponentScan("com.example.rest_demo")
class RestDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
