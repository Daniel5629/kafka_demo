package com.dn.kafka_demo.config.kafka;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

//    @Bean
//    public KafkaProducer<String, String> kafkaProducer() {
//        Properties properties = new Properties();
//        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//
//        return new KafkaProducer<>(properties);
//    }
//
//    @Bean
//    public KafkaConsumer<String, String> kafkaConsumer() {
//        Properties properties = new Properties();
//        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "consumer-group");
//        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
//        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//
//        return new KafkaConsumer<>(properties);
//    }

}
