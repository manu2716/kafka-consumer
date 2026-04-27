package com.example.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GracefulShutdownKafkaHandler {

    @EventListener(ContextClosedEvent.class)
    public void shutdown(){
        System.out.println("Received ContextClosedEvent. Initiating graceful shutdown of Kafka consumers.");
        log.info("Application context is closing. Initiating graceful shutdown of Kafka consumers.");
    }
}
