package com.example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

//TODO move the properties to configuration class
//TODO try to send a Java object from producer instead of String
//TODO try to implement the avro serializer and deserializer
//TODO implement two or more consumers
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test", groupId = "test-group")
    public void consumeMessage(String message){
        System.out.println("Received message: "+message);
    }
}
