package com.alexis.restaurant.application.handler;

import com.alexis.restaurant.application.dto.request.ObjectRequestDto;
import com.alexis.restaurant.application.dto.response.ObjectResponseDto;

import java.util.List;

public interface IObjectHandler {
    void saveObject(ObjectRequestDto objectRequestDto);
    List<ObjectResponseDto> getAllObjects();
}
