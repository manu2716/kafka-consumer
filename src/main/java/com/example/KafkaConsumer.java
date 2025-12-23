package com.example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test", groupId = "test-group")
    public void consumeMessage(String message){
        System.out.println("Received message: "+message);
    }
}
