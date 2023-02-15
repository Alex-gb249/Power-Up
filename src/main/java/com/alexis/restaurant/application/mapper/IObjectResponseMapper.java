package com.alexis.restaurant.application.mapper;

import com.alexis.restaurant.application.dto.response.ObjectResponseDto;
import com.alexis.restaurant.domain.model.ObjectModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IObjectResponseMapper {
    ObjectResponseDto toResponse(ObjectModel objectModel);
    List<ObjectResponseDto> toResponseList(List<ObjectModel> objectModelList);
}
