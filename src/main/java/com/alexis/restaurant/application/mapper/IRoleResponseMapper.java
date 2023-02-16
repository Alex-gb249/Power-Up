package com.alexis.restaurant.application.mapper;

import com.alexis.restaurant.application.dto.response.RoleResponseDto;
import com.alexis.restaurant.domain.model.RoleModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRoleResponseMapper {
    RoleResponseDto toResponse(RoleModel roleModel);
}
