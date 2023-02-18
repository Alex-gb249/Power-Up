package com.alexis.restaurant.infrastructure.output.repository;

import com.alexis.restaurant.infrastructure.output.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<RoleEntity, Long> {
}
