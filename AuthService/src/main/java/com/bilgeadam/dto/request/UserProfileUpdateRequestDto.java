package com.bilgeadam.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileUpdateRequestDto {
    private String token;
    private String email;
    private String username;
    private String avatar;
    private String address;
    private String phone;
    private String about;
}
