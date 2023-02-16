package com.alexis.restaurant.application.mapper;

import com.alexis.restaurant.application.dto.request.RoleRequestDto;
import com.alexis.restaurant.domain.model.RoleModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRoleRequestMapper {
    RoleModel toRole(RoleRequestDto roleRequestDto);
}
