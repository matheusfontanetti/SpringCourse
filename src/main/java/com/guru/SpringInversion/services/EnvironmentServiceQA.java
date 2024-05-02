package com.guru.SpringInversion.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("environmentService")
public class EnvironmentServiceQA implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "qa";
    }
}
