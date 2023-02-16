package com.alexis.restaurant.application.handler;

import com.alexis.restaurant.application.dto.request.RoleRequestDto;

public interface IRoleHandler {
    void saveRole(RoleRequestDto roleRequestDto);
}
