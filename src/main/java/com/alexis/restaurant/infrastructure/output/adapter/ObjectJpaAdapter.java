package com.alexis.restaurant.infrastructure.output.adapter;

import com.alexis.restaurant.domain.model.ObjectModel;
import com.alexis.restaurant.domain.spi.IObjectPersistencePort;
import com.alexis.restaurant.infrastructure.exception.NoDataFoundException;
import com.alexis.restaurant.infrastructure.output.entity.ObjectEntity;
import com.alexis.restaurant.infrastructure.output.mapper.IObjectEntityMapper;
import com.alexis.restaurant.infrastructure.output.repository.IObjectRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ObjectJpaAdapter implements IObjectPersistencePort {
    private final IObjectRepository objectRepository;
    private final IObjectEntityMapper objectEntityMapper;

    @Override
    public ObjectModel saveObject(ObjectModel objectModel) {
        ObjectEntity objectEntity = objectRepository.save(objectEntityMapper.toEntity(objectModel));
        return objectEntityMapper.toObjectModel(objectEntity);
    }

    @Override
    public List<ObjectModel> getAllObjects() {
        List<ObjectEntity> entityList = objectRepository.findAll();
        if(entityList.isEmpty()) {
            throw new NoDataFoundException();
        }
        return objectEntityMapper.toObjectModelList(entityList);
    }
}
