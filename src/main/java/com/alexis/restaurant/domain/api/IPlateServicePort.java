package com.alexis.restaurant.domain.api;

import com.alexis.restaurant.domain.model.PlateModel;

public interface IPlateServicePort {
    void savePlate(PlateModel plateModel);
}
