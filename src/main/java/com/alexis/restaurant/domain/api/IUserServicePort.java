package com.alexis.restaurant.domain.api;

import com.alexis.restaurant.domain.model.UserModel;

public interface IUserServicePort {
    void saveUser(UserModel userModel);
}
