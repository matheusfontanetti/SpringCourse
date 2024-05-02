package com.guru.SpringInversion.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("uat")
@Service("environmentService")
public class EnvironmentServiceImplUaT implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "uat";
    }
}
