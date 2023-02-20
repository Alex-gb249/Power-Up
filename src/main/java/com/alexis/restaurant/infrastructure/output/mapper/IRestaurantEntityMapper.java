package com.alexis.restaurant.infrastructure.output.mapper;

import com.alexis.restaurant.domain.model.RestaurantModel;
import com.alexis.restaurant.infrastructure.output.entity.RestaurantEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRestaurantEntityMapper {
    RestaurantEntity toEntity(RestaurantModel restaurantModel);
    RestaurantModel toRestaurantModel(RestaurantEntity restaurantEntity);
}
