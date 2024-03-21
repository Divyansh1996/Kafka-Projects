package com.example.cabuser.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Listener {

    @KafkaListener(topics = "newTopic", groupId = "newId")
    public void getMessage(String message){
        System.out.println(message);
    }
}
