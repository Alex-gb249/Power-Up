package com.alexis.restaurant.domain.api;

import com.alexis.restaurant.domain.model.RestaurantModel;

public interface IRestaurantServicePort {
    void saveRestaurant(RestaurantModel restaurantModel);
}
