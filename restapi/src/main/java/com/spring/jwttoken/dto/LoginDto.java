package com.spring.jwttoken.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDto {

    @NotBlank
    private String email;
    @NotBlank
    private String password;
}
