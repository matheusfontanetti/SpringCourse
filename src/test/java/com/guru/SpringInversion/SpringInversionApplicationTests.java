package com.guru.SpringInversion;

import com.guru.SpringInversion.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringInversionApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController controller;

	@Test
	void testAutowireOfController(){
		System.out.println(controller.sayHello());
	}

	@Test
	void testGetControllerFromCtx(){
		MyController controller = applicationContext.getBean(MyController.class);

		System.out.println(controller.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
