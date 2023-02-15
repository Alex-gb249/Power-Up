package com.alexis.restaurant.infrastructure.configuration;

import com.alexis.restaurant.domain.api.IObjectServicePort;
import com.alexis.restaurant.domain.spi.IObjectPersistencePort;
import com.alexis.restaurant.domain.usecase.ObjectUseCase;
import com.alexis.restaurant.infrastructure.output.adapter.ObjectJpaAdapter;
import com.alexis.restaurant.infrastructure.output.mapper.IObjectEntityMapper;
import com.alexis.restaurant.infrastructure.output.repository.IObjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IObjectRepository objectRepository;
    private final IObjectEntityMapper objectEntityMapper;

    @Bean
    public IObjectPersistencePort objectPersistencePort() {
        return new ObjectJpaAdapter(objectRepository, objectEntityMapper);
    }

    @Bean
    public IObjectServicePort objectServicePort() {
        return new ObjectUseCase(objectPersistencePort());
    }
}
