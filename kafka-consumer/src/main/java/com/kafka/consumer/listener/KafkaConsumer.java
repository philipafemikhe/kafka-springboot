package com.kafka.consumer.listener;

import com.kafka.consumer.model.KafkaPayload;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "com.ng.vela.even.card_verified", groupId = "com.minthr")
    public void consume(KafkaPayload payload){
        System.out.println(payload.toString());
    }
}
