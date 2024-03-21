package com.example.cabdriver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class DriverConfig {

    @Bean
    public NewTopic makeNewTopic(){
        return TopicBuilder.name("newTopic").build();
    }
}
