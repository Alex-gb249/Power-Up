package com.alexis.restaurant.domain.spi;

import com.alexis.restaurant.domain.model.UserModel;

public interface IUserPersistencePort {
    UserModel saveUser(UserModel userModel);
}
