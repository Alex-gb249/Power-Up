package com.alexis.restaurant.application.mapper;

import com.alexis.restaurant.application.dto.request.PlateRequestDto;
import com.alexis.restaurant.domain.model.PlateModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPlateRequestMapper {
    PlateModel toModel(PlateRequestDto plateRequestDto);
}
