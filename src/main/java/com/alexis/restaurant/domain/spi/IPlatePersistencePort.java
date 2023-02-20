package com.alexis.restaurant.domain.spi;

import com.alexis.restaurant.domain.model.PlateModel;

public interface IPlatePersistencePort {
    PlateModel savePlate(PlateModel plateModel);
}
