package com.dn.kafka_demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerServiceImpl implements KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("kafka.topic.name:demo")
    private final String topic;

    @Override
    public void send(String message) {
        kafkaTemplate.send(topic, message);
    }
}
