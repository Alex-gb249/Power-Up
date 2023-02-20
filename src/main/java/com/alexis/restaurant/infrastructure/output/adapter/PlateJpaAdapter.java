package com.alexis.restaurant.infrastructure.output.adapter;

import com.alexis.restaurant.domain.model.PlateModel;
import com.alexis.restaurant.domain.spi.IPlatePersistencePort;
import com.alexis.restaurant.infrastructure.output.entity.PlateEntity;
import com.alexis.restaurant.infrastructure.output.mapper.IPlateEntityMapper;
import com.alexis.restaurant.infrastructure.output.repository.IPlateRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlateJpaAdapter implements IPlatePersistencePort {
    private final IPlateRepository plateRepository;
    private final IPlateEntityMapper plateEntityMapper;

    @Override
    public PlateModel savePlate(PlateModel plateModel) {
        PlateEntity plateEntity = plateRepository.save(plateEntityMapper.toEntity(plateModel));
        return plateEntityMapper.toPlateModel(plateEntity);
    }
}
