package com.alexis.restaurant.domain.usecase;

import com.alexis.restaurant.domain.api.IRoleServicePort;
import com.alexis.restaurant.domain.model.RoleModel;
import com.alexis.restaurant.domain.spi.IRolePersistencePort;

public class RoleUseCase implements IRoleServicePort {
    private final IRolePersistencePort rolePersistencePort;

    public RoleUseCase(IRolePersistencePort rolePersistencePort) {
        this.rolePersistencePort = rolePersistencePort;
    }

    @Override
    public void saveRole(RoleModel roleModel) { rolePersistencePort.saveRole(roleModel); }
}
