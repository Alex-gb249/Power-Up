package com.alexis.restaurant.application.handler.impl;

import com.alexis.restaurant.application.dto.request.RoleRequestDto;
import com.alexis.restaurant.application.handler.IRoleHandler;
import com.alexis.restaurant.application.mapper.IRoleRequestMapper;
import com.alexis.restaurant.application.mapper.IRoleResponseMapper;
import com.alexis.restaurant.domain.api.IRoleServicePort;
import com.alexis.restaurant.domain.model.RoleModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class RoleHandler implements IRoleHandler {
    private final IRoleServicePort roleServicePort;
    private final IRoleRequestMapper roleRequestMapper;
    private final IRoleResponseMapper roleResponseMapper;

    @Override
    public void saveRole(RoleRequestDto roleRequestDto) {
        RoleModel roleModel = roleRequestMapper.toRole(roleRequestDto);
        roleServicePort.saveRole(roleModel);
    }
}
