package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value("${id}")
    private String id;

    // When refreshscope is commented out, everything works.
    @RefreshScope
    @Bean
    public Id pojo() {
        return new Id(id);
    }
}
