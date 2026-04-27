package com.example.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

//TODO try to send a Java object from producer instead of String
//TODO try to implement the avro serializer and deserializer
//TODO implement two or more consumers
@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeMessage(String message){
        try {
            log.info("Received message='{}'", message);
        } catch (Exception e) {
            log.error("Error processing message: {}",message, e);
        }
    }
}
