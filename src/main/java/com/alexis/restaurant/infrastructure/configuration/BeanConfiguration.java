package com.alexis.restaurant.infrastructure.configuration;

import com.alexis.restaurant.domain.api.IObjectServicePort;
import com.alexis.restaurant.domain.api.IRestaurantServicePort;
import com.alexis.restaurant.domain.api.IRoleServicePort;
import com.alexis.restaurant.domain.api.IUserServicePort;
import com.alexis.restaurant.domain.spi.IObjectPersistencePort;
import com.alexis.restaurant.domain.spi.IRestaurantPersistencePort;
import com.alexis.restaurant.domain.spi.IRolePersistencePort;
import com.alexis.restaurant.domain.spi.IUserPersistencePort;
import com.alexis.restaurant.domain.usecase.ObjectUseCase;
import com.alexis.restaurant.domain.usecase.RestaurantUseCase;
import com.alexis.restaurant.domain.usecase.RoleUseCase;
import com.alexis.restaurant.domain.usecase.UserUseCase;
import com.alexis.restaurant.infrastructure.output.adapter.ObjectJpaAdapter;
import com.alexis.restaurant.infrastructure.output.adapter.RestaurantJpaAdapter;
import com.alexis.restaurant.infrastructure.output.adapter.RoleJpaAdapter;
import com.alexis.restaurant.infrastructure.output.adapter.UserJpaAdapter;
import com.alexis.restaurant.infrastructure.output.mapper.IObjectEntityMapper;
import com.alexis.restaurant.infrastructure.output.mapper.IRestaurantEntityMapper;
import com.alexis.restaurant.infrastructure.output.mapper.IRoleEntityMapper;
import com.alexis.restaurant.infrastructure.output.mapper.IUserEntityMapper;
import com.alexis.restaurant.infrastructure.output.repository.IObjectRepository;
import com.alexis.restaurant.infrastructure.output.repository.IRestaurantRepository;
import com.alexis.restaurant.infrastructure.output.repository.IRoleRepository;
import com.alexis.restaurant.infrastructure.output.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IObjectRepository objectRepository;
    private final IObjectEntityMapper objectEntityMapper;

    private final IUserRepository userRepository;
    private final IUserEntityMapper userEntityMapper;
    private final IRoleRepository roleRepository;
    private final IRoleEntityMapper roleEntityMapper;

    private final IRestaurantRepository restaurantRepository;
    private final IRestaurantEntityMapper restaurantEntityMapper;

    @Bean
    public IObjectPersistencePort objectPersistencePort() {
        return new ObjectJpaAdapter(objectRepository, objectEntityMapper);
    }

    @Bean
    public IObjectServicePort objectServicePort() {
        return new ObjectUseCase(objectPersistencePort());
    }

    @Bean
    public IUserPersistencePort userPersistencePort() {
        return new UserJpaAdapter(userRepository, userEntityMapper);
    }

    @Bean
    public IUserServicePort userServicePort() { return new UserUseCase(userPersistencePort()); }

    @Bean
    public IRolePersistencePort rolePersistencePort() {
        return new RoleJpaAdapter(roleRepository, roleEntityMapper);
    }

    @Bean
    public IRoleServicePort roleServicePort() { return new RoleUseCase(rolePersistencePort()); }

    @Bean
    public IRestaurantPersistencePort restaurantPersistencePort() {
        return new RestaurantJpaAdapter(restaurantRepository, restaurantEntityMapper);
    }

    @Bean
    public IRestaurantServicePort restaurantServicePort() { return new RestaurantUseCase(restaurantPersistencePort()); }
}
