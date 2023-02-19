package com.alexis.restaurant.infrastructure.output.adapter;

import com.alexis.restaurant.domain.model.RoleModel;
import com.alexis.restaurant.domain.spi.IRolePersistencePort;
import com.alexis.restaurant.infrastructure.output.entity.RoleEntity;
import com.alexis.restaurant.infrastructure.output.mapper.IRoleEntityMapper;
import com.alexis.restaurant.infrastructure.output.repository.IRoleRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RoleJpaAdapter implements IRolePersistencePort {
    private final IRoleRepository roleRepository;
    private final IRoleEntityMapper roleEntityMapper;

    @Override
    public RoleModel saveRole(RoleModel roleModel) {
        RoleEntity roleEntity = roleRepository.save(roleEntityMapper.toObjectEntity(roleModel));
        return roleEntityMapper.toRoleModel(roleEntity);
    }
}
