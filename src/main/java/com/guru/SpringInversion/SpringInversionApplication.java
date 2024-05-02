package com.guru.SpringInversion;

import com.guru.SpringInversion.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInversionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringInversionApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In main method");

		System.out.println(controller.sayHello());


	}

}
