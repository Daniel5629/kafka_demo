package com.dn.kafka_demo.controller;

import com.dn.kafka_demo.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class KafkaController {

    private final KafkaProducerService kafkaProducerService;

    @GetMapping("/")
    public String healthCheck() {
        return "hello world";
    }

    @PostMapping("/v1/kafka")
    public void sendMessage(@RequestBody String message) {
        kafkaProducerService.send(message);
    }
}
