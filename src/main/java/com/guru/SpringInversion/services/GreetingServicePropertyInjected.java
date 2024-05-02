package com.guru.SpringInversion.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService") //entre parenteses é o nome que será utilizado para o Spring encontrar esse serviço
public class GreetingServicePropertyInjected implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection!!!!";    }
}
