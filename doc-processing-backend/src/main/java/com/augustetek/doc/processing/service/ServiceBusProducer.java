package com.augustetek.doc.processing.service;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceBusProducer {

    private final RabbitTemplate rabbitTemplate;

    public void sendDocumentEvent(String event) {
        rabbitTemplate.convertAndSend("documents.exchange", "documents.key", event);
    }
}
