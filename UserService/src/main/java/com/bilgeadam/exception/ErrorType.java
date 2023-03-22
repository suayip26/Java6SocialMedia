package com.bilgeadam.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
@AllArgsConstructor
public enum ErrorType {
    INTERNAL_ERROR(5200,"Sunucu Hatası",HttpStatus.INTERNAL_SERVER_ERROR),
    BAD_REQUEST(4200,"Parametre Hatası",HttpStatus.BAD_REQUEST),
    USERNAME_DUPLICATE(4210,"Bu kullanıcı adı kullanılmış",HttpStatus.BAD_REQUEST),
    USER_NOT_FOUND(4211,"Boyle bir kullanici bulunamadi",HttpStatus.NOT_FOUND),
    USER_NOT_CREATED(4212,"Kullanıcı OLUŞTURULAMADI",HttpStatus.BAD_REQUEST),
    INVALID_TOKEN(4213,"Gecersiz Token",HttpStatus.BAD_REQUEST);

    private int code;
    private String message;
    HttpStatus httpStatus;
}
