package com.alexis.restaurant.domain.api;

import com.alexis.restaurant.domain.model.ObjectModel;

import java.util.List;

public interface IObjectServicePort {
    void saveObject(ObjectModel objectModel);
    List<ObjectModel> getAllObjects();
}
