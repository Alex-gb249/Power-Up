package com.alexis.restaurant.application.handler;

import com.alexis.restaurant.application.dto.request.UserRequestDto;

public interface IUserHandler {
    void saveUser(UserRequestDto userRequestDto);
}
