package com.guru.SpringInversion.controllers;

import com.guru.SpringInversion.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")//Qualifier chama o serviço GreetingServicePropertyinjected com nome propertyGreetingService
    @Autowired
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
