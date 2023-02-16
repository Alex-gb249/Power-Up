package com.alexis.restaurant.application.handler.impl;

import com.alexis.restaurant.application.dto.request.UserRequestDto;
import com.alexis.restaurant.application.handler.IUserHandler;
import com.alexis.restaurant.application.mapper.IUserRequestMapper;
import com.alexis.restaurant.application.mapper.IUserResponseMapper;
import com.alexis.restaurant.domain.api.IUserServicePort;
import com.alexis.restaurant.domain.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class UserHandler implements IUserHandler {
    private final IUserServicePort userServicePort;
    private final IUserRequestMapper userRequestMapper;
    private final IUserResponseMapper userResponseMapper;

    @Override
    public void saveUser(UserRequestDto userRequestDto) {
        UserModel userModel = userRequestMapper.toUser(userRequestDto);
        userServicePort.saveUser(userModel);
    }
}
