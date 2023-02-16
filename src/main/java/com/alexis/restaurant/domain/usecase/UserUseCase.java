package com.alexis.restaurant.domain.usecase;

import com.alexis.restaurant.domain.api.IUserServicePort;
import com.alexis.restaurant.domain.model.UserModel;
import com.alexis.restaurant.domain.spi.IUserPersistencePort;

public class UserUseCase implements IUserServicePort {
    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void saveUser(UserModel userModel) { userPersistencePort.saveUser(userModel); }
}
