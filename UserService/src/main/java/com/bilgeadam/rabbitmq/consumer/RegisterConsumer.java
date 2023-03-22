package com.bilgeadam.rabbitmq.consumer;

import com.bilgeadam.mapper.IUserMapper;
import com.bilgeadam.rabbitmq.model.RegisterModel;
import com.bilgeadam.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j // consol a log info ciktisi vermek icin kullanilan kutuphane
public class RegisterConsumer {
    private final UserProfileService userProfileService;

//  @RabbitListener(queues = ("register-queue"))
    @RabbitListener(queues = ("${rabbitmq.queueRegister}"))
    public void newUserCreate(RegisterModel model){
        log.info("User {}", model.toString());
        userProfileService.createUserWithRabbitMq(model);
//      userProfileService.createUser(IUserMapper.INSTANCE.toNewCreateUserRequestDto(model)); 2. yol
    }
}
