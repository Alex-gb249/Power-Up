package com.alexis.restaurant.application.handler.impl;

import com.alexis.restaurant.application.dto.request.PlateRequestDto;
import com.alexis.restaurant.application.handler.IPlateHandler;
import com.alexis.restaurant.application.mapper.IPlateRequestMapper;
import com.alexis.restaurant.application.mapper.IPlateResponseMapper;
import com.alexis.restaurant.domain.api.IPlateServicePort;
import com.alexis.restaurant.domain.model.PlateModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class PlateHandler implements IPlateHandler {
    private final IPlateServicePort plateServicePort;
    private final IPlateRequestMapper plateRequestMapper;
    private final IPlateResponseMapper plateResponseMapper;

    @Override
    public void savePlate(PlateRequestDto plateRequestDto) {
        PlateModel plateModel = plateRequestMapper.toModel(plateRequestDto);
        plateServicePort.savePlate(plateModel);
    }
}
