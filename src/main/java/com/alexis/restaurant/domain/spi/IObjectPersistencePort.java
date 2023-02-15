package com.alexis.restaurant.domain.spi;

import com.alexis.restaurant.domain.model.ObjectModel;

import java.util.List;

public interface IObjectPersistencePort {
    ObjectModel saveObject(ObjectModel objectModel);
    List<ObjectModel> getAllObjects();
}
