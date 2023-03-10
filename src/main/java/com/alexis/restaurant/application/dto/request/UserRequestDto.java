package com.alexis.restaurant.application.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String password;
    private RoleRequestDto role;
}
