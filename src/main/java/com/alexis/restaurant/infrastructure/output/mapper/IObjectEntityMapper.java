package com.alexis.restaurant.infrastructure.output.mapper;

import com.alexis.restaurant.domain.model.ObjectModel;
import com.alexis.restaurant.infrastructure.output.entity.ObjectEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IObjectEntityMapper {
    ObjectEntity toObjectEntity(ObjectModel object);
    ObjectModel toObjectModel(ObjectEntity objectEntity);
    List<ObjectModel> toObjectModelList(List<ObjectEntity> userEntityList);
}
