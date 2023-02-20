package com.alexis.restaurant.infrastructure.output.repository;

import com.alexis.restaurant.infrastructure.output.entity.PlateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlateRepository extends JpaRepository<PlateEntity, Long> {
}
