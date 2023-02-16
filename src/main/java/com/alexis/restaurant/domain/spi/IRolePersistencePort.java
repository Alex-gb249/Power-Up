package com.alexis.restaurant.domain.spi;

import com.alexis.restaurant.domain.model.RoleModel;

public interface IRolePersistencePort {
    RoleModel saveRole(RoleModel roleModel);
}
