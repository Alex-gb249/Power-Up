package com.alexis.restaurant.infrastructure.output.mapper;

import com.alexis.restaurant.domain.model.PlateModel;
import com.alexis.restaurant.infrastructure.output.entity.PlateEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPlateEntityMapper {
    PlateEntity toEntity(PlateModel plateModel);
    PlateModel toPlateModel(PlateEntity plateEntity);
}
