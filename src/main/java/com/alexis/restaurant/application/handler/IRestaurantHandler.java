package com.alexis.restaurant.application.handler;

import com.alexis.restaurant.application.dto.request.RestaurantRequestDto;

public interface IRestaurantHandler {
    void saveRestaurant(RestaurantRequestDto restaurantRequestDto);
}
