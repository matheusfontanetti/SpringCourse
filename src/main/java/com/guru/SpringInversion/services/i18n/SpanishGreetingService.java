package com.guru.SpringInversion.services.i18n;

import com.guru.SpringInversion.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")//@Profile é uma anotação para distinguir serviços no mesmo nome onde indica qual é o nome do perfil que o serviço esta sendo utilizado
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo!";
    }
}
