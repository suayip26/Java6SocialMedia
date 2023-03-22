package com.bilgeadam.config.rabbtimq;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    // auth-microservice olusturdugumuz kuyrugu user microservice'de de
    // configuration ayarları ile olusturuyoruz
    @Value("${rabbitmq.queueRegister}")
    private String queueNameRegister;

    @Bean
    Queue registerQueue(){
        return new Queue(queueNameRegister);
    }
}
