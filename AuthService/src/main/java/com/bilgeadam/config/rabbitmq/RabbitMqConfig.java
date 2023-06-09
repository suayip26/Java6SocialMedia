package com.bilgeadam.config.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {
    @Value("${rabbitmq.exchange-auth}")
    private String exchange;
    @Value("${rabbitmq.registerkey}")
    private String registerBindingKey;
    @Value("${rabbitmq.queueRegister}")
    private String queueNameRegister;

    @Bean // burdan donen degeri spring yonetebilsin diye ekledik
    DirectExchange exchangeAuth(){
        return new DirectExchange(exchange);
    }

    @Bean
    Queue registerQueue(){
        return new Queue(queueNameRegister);
    }

    @Bean
    public Binding bindingRegister(final Queue registerQueue, final DirectExchange exchangeAuth){
        return BindingBuilder.bind(registerQueue).to(exchangeAuth).with(registerBindingKey);
    }
}
