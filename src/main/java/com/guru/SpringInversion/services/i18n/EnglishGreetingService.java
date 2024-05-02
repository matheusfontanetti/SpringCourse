package com.guru.SpringInversion.services.i18n;

import com.guru.SpringInversion.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})//@Profile é uma anotação para distinguir serviços no mesmo nome onde indica qual é o nome do perfil que o serviço esta sendo utilizado
//default avisa que aquele profile será aplicado para todos, por padrão o profile é default se não existir outros profiles
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
