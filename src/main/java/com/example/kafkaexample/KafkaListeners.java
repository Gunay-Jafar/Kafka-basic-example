package com.example.kafkaexample;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "amigoscode",
            groupId = "groupId  "
    )
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
