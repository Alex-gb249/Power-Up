package com.alexis.restaurant.application.mapper;

import com.alexis.restaurant.application.dto.response.PlateResponseDto;
import com.alexis.restaurant.domain.model.PlateModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPlateResponseMapper {
    PlateResponseDto toResponse(PlateModel plateModel);
}
