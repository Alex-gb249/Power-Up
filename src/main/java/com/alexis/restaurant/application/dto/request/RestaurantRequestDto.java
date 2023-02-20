package com.alexis.restaurant.application.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestaurantRequestDto {
    private String name;
    private String address;
    private Long id_owner;
    private String phone;
    private String url_logo;
    private String nit;
}
