package com.alexis.restaurant.infrastructure.output.mapper;

import com.alexis.restaurant.domain.model.UserModel;
import com.alexis.restaurant.infrastructure.output.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserEntityMapper {
    UserEntity toEntity(UserModel userModel);
    UserModel toUserModel(UserEntity userEntity);

}
