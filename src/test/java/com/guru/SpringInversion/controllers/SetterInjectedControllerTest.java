package com.guru.SpringInversion.controllers;

import com.guru.SpringInversion.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController setterInjectedController;

   /** @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl()); // irá dar nullpointer se comentado pois greetimgService esta null
    }**/

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}