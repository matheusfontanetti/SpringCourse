package com.guru.SpringInversion.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary//necessário essa anotação pois o Spring irá dar erro pois não sabe qual bean deve ser chamada.Ao usar essa anotação
//ele diz ao Spring que essa é a bean principal que deve ser chamada.
public class GreetingServicePrimary implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from the Primary Bean";
    }
}
