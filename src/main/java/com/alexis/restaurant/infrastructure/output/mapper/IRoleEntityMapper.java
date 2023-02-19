package com.alexis.restaurant.infrastructure.output.mapper;

import com.alexis.restaurant.domain.model.RoleModel;
import com.alexis.restaurant.infrastructure.output.entity.RoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRoleEntityMapper {
    RoleEntity toObjectEntity(RoleModel role);
    RoleModel toRoleModel(RoleEntity roleEntity);
}
