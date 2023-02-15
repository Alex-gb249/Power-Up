package com.alexis.restaurant.infrastructure.output.repository;

import com.alexis.restaurant.infrastructure.output.entity.ObjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IObjectRepository extends JpaRepository<ObjectEntity, Long> {}
