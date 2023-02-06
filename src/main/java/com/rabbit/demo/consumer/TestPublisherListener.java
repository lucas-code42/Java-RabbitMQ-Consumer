package com.rabbit.demo.consumer;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TestPublisherListener {

    @RabbitListener(queues = "test.publisher")
    public void ListenerTestPublisher(Message message) {
        System.out.printf("[X] MESSAGE CONSUME -> %s\n", message.toString());
    }
}
