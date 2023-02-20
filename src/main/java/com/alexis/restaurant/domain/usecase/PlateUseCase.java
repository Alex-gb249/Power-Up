package com.alexis.restaurant.domain.usecase;

import com.alexis.restaurant.domain.api.IPlateServicePort;
import com.alexis.restaurant.domain.model.PlateModel;
import com.alexis.restaurant.domain.spi.IPlatePersistencePort;

public class PlateUseCase implements IPlateServicePort {
    private final IPlatePersistencePort platePersistencePort;

    public PlateUseCase(IPlatePersistencePort platePersistencePort) {
        this.platePersistencePort = platePersistencePort;
    }

    @Override
    public void savePlate(PlateModel plateModel) { platePersistencePort.savePlate(plateModel); }
}
