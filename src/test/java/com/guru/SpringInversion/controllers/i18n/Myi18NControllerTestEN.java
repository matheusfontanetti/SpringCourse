package com.guru.SpringInversion.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("EN")//indica qual é o perfil ativo para o teste @ActiveProfiles é somente usado em testes!!
@SpringBootTest
class Myi18NControllerTestEN {

    @Autowired
    Myi18NController myi18NController;

    @Test
    void sayHello() {

        System.out.println(myi18NController.sayHello());
    }
}