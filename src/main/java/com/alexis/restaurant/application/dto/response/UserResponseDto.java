package com.alexis.restaurant.application.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {
    private Long id;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String password;
    private RoleResponseDto role;
}
