package com.guru.SpringInversion.controllers;

import com.guru.SpringInversion.services.GreetingService;
import com.guru.SpringInversion.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }


    public String sayHello(){
        System.out.println("In controller");
        return greetingService.sayGreeting();
    }
}
