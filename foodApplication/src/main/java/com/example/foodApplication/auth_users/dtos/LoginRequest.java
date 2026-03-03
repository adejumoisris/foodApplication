package com.example.foodApplication.auth_users.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank(message = "Email is required")
    @Email(message = "invalid email format")
    private String email;
    @NotBlank(message = "password is required")
    private String password;

}
