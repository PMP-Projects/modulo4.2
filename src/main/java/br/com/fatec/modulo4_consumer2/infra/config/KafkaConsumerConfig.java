package br.com.fatec.modulo4_consumer2.infra.config;

import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.serializer.JsonDeserializer;

@Configuration
public class KafkaConsumerConfig {

    @Bean
    public Logger logger() {
        return org.slf4j.LoggerFactory.getLogger("Consumer2Logger");
    }

    @Bean
    public JsonDeserializer<Object> jsonDeserializer() {

        JsonDeserializer<Object> deserializer = new JsonDeserializer<>();
        deserializer.addTrustedPackages("*");

        return deserializer;
    }

}
