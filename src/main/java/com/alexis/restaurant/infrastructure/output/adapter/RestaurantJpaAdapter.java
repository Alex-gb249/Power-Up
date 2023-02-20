package com.alexis.restaurant.infrastructure.output.adapter;

import com.alexis.restaurant.domain.model.RestaurantModel;
import com.alexis.restaurant.domain.spi.IRestaurantPersistencePort;
import com.alexis.restaurant.infrastructure.output.entity.RestaurantEntity;
import com.alexis.restaurant.infrastructure.output.mapper.IRestaurantEntityMapper;
import com.alexis.restaurant.infrastructure.output.repository.IRestaurantRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RestaurantJpaAdapter implements IRestaurantPersistencePort {
    private final IRestaurantRepository restaurantRepository;
    private final IRestaurantEntityMapper restaurantEntityMapper;


    @Override
    public RestaurantModel saveRestaurant(RestaurantModel restaurantModel) {
        RestaurantEntity restaurantEntity = restaurantRepository.save(restaurantEntityMapper.toEntity(restaurantModel));
        return restaurantEntityMapper.toRestaurantModel(restaurantEntity);
    }
}
