package com.alfinandika.kafka.springbootkafkaconsumerexample.listener;

import com.alfinandika.kafka.springbootkafkaconsumerexample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "KAFKA_EXAMPLE", groupId = "group_id")
    public void consume(String message){

        System.out.println("consumed message : "+message);
    }

    @KafkaListener(topics = "KAFKA_EXAMPLE", groupId = "group_json", containerFactory = "userKafkaListenerContainerFactory")
    public void consumeJson(User user){
        System.out.println("consumed message : "+user);
    }
}

