package com.alexis.restaurant.infrastructure.output.repository;

import com.alexis.restaurant.infrastructure.output.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantRepository extends JpaRepository<RestaurantEntity, Long> {
}
