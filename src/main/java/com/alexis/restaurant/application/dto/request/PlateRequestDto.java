package com.alexis.restaurant.application.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlateRequestDto {
    private Long id;
    private String name;
    private Long id_category;
    private String description;
    private Long price;
    private Long id_restaurant;
    private String url_image;
    private Boolean active;
}
