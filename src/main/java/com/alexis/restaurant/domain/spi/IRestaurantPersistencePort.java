package com.alexis.restaurant.domain.spi;

import com.alexis.restaurant.domain.model.RestaurantModel;

public interface IRestaurantPersistencePort {
    RestaurantModel saveRestaurant(RestaurantModel restaurantModel);
}
