package ru.netology.bff.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class bffConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
