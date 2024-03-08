package com.solidprinciple.exercise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.NumberFormat;

@Configuration
public class FormatterConfig {

    @Bean
    public NumberFormat formatter(){
        return NumberFormat.getCurrencyInstance();
    }
}
