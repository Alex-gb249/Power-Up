package com.alexis.restaurant.infrastructure.output.adapter;

import com.alexis.restaurant.domain.model.UserModel;
import com.alexis.restaurant.domain.spi.IUserPersistencePort;
import com.alexis.restaurant.infrastructure.output.entity.UserEntity;
import com.alexis.restaurant.infrastructure.output.mapper.IUserEntityMapper;
import com.alexis.restaurant.infrastructure.output.repository.IUserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistencePort {
    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;


    @Override
    public UserModel saveUser(UserModel userModel) {
        UserEntity userEntity = userRepository.save(userEntityMapper.toEntity(userModel));
        return userEntityMapper.toUserModel(userEntity);
    }
}
