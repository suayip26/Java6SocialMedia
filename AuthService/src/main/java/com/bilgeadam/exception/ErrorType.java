package com.bilgeadam.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
@AllArgsConstructor
public enum ErrorType {
    INTERNAL_ERROR(5100,"Sunucu Hatası",HttpStatus.INTERNAL_SERVER_ERROR),
    BAD_REQUEST(4100,"Parametre Hatası",HttpStatus.BAD_REQUEST),
    LOGIN_ERROR(4110,"Kullanici Adi veya Sifre Hatali",HttpStatus.BAD_REQUEST),
    USERNAME_DUPLICATE(4111,"Bu kullanıcı adı kullanılmış",HttpStatus.BAD_REQUEST),
    USER_NOT_FOUND(4112,"Boyle bir kullanici bulunamadi",HttpStatus.NOT_FOUND),
    ACTIVATE_CODE_ERROR(4113,"Aktivasyon kod hatasi",HttpStatus.BAD_REQUEST),
    INVALID_TOKEN(4114,"Gecersiz token",HttpStatus.BAD_REQUEST),
    TOKEN_NOT_CREATED(4115,"Token olusturulamadi",HttpStatus.BAD_REQUEST),
    ACCOUNT_NOT_ACTIVE(4116,"Aktif olmayan hesap",HttpStatus.FORBIDDEN),
    USER_NOT_CREATED(4116,"Kullanıcı oluşturulamadı!!!",HttpStatus.BAD_REQUEST),
    ROLE_NOT_FOUND(4117,"Boyle bir parametre rolu bulunamadi!!!",HttpStatus.BAD_REQUEST)

    ;

    private int code;
    private String message;
    HttpStatus httpStatus;
}
