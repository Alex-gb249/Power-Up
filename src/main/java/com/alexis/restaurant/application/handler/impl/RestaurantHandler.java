package com.alexis.restaurant.application.handler.impl;

import com.alexis.restaurant.application.dto.request.RestaurantRequestDto;
import com.alexis.restaurant.application.handler.IRestaurantHandler;
import com.alexis.restaurant.application.mapper.IRestaurantRequestMapper;
import com.alexis.restaurant.application.mapper.IRestaurantResponseMapper;
import com.alexis.restaurant.domain.api.IRestaurantServicePort;
import com.alexis.restaurant.domain.model.RestaurantModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class RestaurantHandler implements IRestaurantHandler {
    private final IRestaurantServicePort restaurantServicePort;
    private final IRestaurantRequestMapper restaurantRequestMapper;
    private final IRestaurantResponseMapper restaurantResponseMapper;

    @Override
    public void saveRestaurant(RestaurantRequestDto restaurantRequestDto) {
        RestaurantModel restaurantModel = restaurantRequestMapper.toRestaurant(restaurantRequestDto);
        restaurantServicePort.saveRestaurant(restaurantModel);
    }
}
