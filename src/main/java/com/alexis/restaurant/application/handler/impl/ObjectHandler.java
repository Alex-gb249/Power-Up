package com.alexis.restaurant.application.handler.impl;

import com.alexis.restaurant.application.dto.request.ObjectRequestDto;
import com.alexis.restaurant.application.dto.response.ObjectResponseDto;
import com.alexis.restaurant.application.handler.IObjectHandler;
import com.alexis.restaurant.application.mapper.IObjectRequestMapper;
import com.alexis.restaurant.application.mapper.IObjectResponseMapper;
import com.alexis.restaurant.domain.api.IObjectServicePort;
import com.alexis.restaurant.domain.model.ObjectModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class ObjectHandler implements IObjectHandler {
    private final IObjectServicePort objectServicePort;
    private final IObjectRequestMapper objectRequestMapper;
    private final IObjectResponseMapper objectResponseMapper;

    @Override
    public void saveObject(ObjectRequestDto objectRequestDto) {
        ObjectModel objectModel = objectRequestMapper.toObject(objectRequestDto);
        objectServicePort.saveObject(objectModel);
    }

    @Override
    public List<ObjectResponseDto> getAllObjects() {
        return objectResponseMapper.toResponseList(objectServicePort.getAllObjects());
    }
}
