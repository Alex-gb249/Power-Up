package com.alexis.restaurant.application.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleRequestDto {
    private Long id;
    private String name;
    private String description;
}
