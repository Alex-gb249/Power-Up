package com.alexis.restaurant.domain.usecase;

import com.alexis.restaurant.domain.api.IRestaurantServicePort;
import com.alexis.restaurant.domain.model.RestaurantModel;
import com.alexis.restaurant.domain.spi.IRestaurantPersistencePort;

public class RestaurantUseCase implements IRestaurantServicePort {
    private final IRestaurantPersistencePort restaurantPersistencePort;

    public RestaurantUseCase(IRestaurantPersistencePort restaurantPersistencePort) {
        this.restaurantPersistencePort = restaurantPersistencePort;
    }

    @Override
    public void saveRestaurant(RestaurantModel restaurantModel) { restaurantPersistencePort.saveRestaurant(restaurantModel); }
}
