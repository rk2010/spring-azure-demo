package com.example.rest_demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


//@SpringBootTest(classes = RestDemoApplication.class)
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = RestDemoApplication.class)
class RestDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
