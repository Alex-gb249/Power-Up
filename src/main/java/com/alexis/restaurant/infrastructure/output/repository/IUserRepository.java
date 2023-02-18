package com.alexis.restaurant.infrastructure.output.repository;

import com.alexis.restaurant.infrastructure.output.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {
}
