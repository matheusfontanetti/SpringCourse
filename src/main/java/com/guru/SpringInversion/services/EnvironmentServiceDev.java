package com.guru.SpringInversion.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev,default"})
@Service("environmentService")
public class EnvironmentServiceDev implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "dev";
    }
}
