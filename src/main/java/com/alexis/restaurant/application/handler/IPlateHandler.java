package com.alexis.restaurant.application.handler;

import com.alexis.restaurant.application.dto.request.PlateRequestDto;

public interface IPlateHandler {
    void savePlate(PlateRequestDto plateRequestDto);
}
