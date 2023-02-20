package com.alexis.restaurant.domain.model;

public class PlateModel {
    private Long id;
    private String name;
    private Long id_category;
    private String description;
    private Long price;
    private Long id_restaurant;
    private String url_image;
    private Boolean active;

    public PlateModel(Long id, String name, Long id_category, String description, Long price, Long id_restaurant, String url_image, Boolean active) {
        this.id = id;
        this.name = name;
        this.id_category = id_category;
        this.description = description;
        this.price = price;
        this.id_restaurant = id_restaurant;
        this.url_image = url_image;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId_category() {
        return id_category;
    }

    public void setId_category(Long id_category) {
        this.id_category = id_category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getId_restaurant() {
        return id_restaurant;
    }

    public void setId_restaurant(Long id_restaurant) {
        this.id_restaurant = id_restaurant;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
