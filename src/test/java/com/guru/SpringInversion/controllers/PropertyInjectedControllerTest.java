package com.guru.SpringInversion.controllers;

import com.guru.SpringInversion.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;

  /*  @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();// irá dar nullpointer se comentado pois greetimgService esta null
    }irá ser usando SpringBootTest e autowired para Spring injetar automaticamente as dependencias*/

    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}