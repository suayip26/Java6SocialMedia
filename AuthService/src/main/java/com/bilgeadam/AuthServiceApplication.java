package com.bilgeadam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  Repository, Service ve Controller katmanlarını oluşturalım
 *  - Register methodu (@PostMapping) yazılacak ve buna bir endpoint yazalım
 *  - Bu işlemler requestDto ile yapılacak, donus tipi de responseDto olsun.
 */
@SpringBootApplication
@EnableFeignClients // istek gonderen microservice
public class AuthServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthServiceApplication.class);
    }
}