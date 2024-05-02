package com.guru.SpringInversion.controllers;

import com.guru.SpringInversion.services.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(@Qualifier("environmentService") EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment(){
        return "You are in " + environmentService.getEnvironment() + " environment";
    }

}
