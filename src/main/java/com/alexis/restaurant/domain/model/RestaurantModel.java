package com.alexis.restaurant.domain.model;

public class RestaurantModel {
    private Long id;
    private String name;
    private String address;
    private Long id_owner;
    private String phone;
    private String url_logo;
    private String nit;

    public RestaurantModel(Long id, String name, String address, Long id_owner, String phone, String url_logo, String nit) {
        // TODO: Create a validation for restaurant
        this.id = id;
        this.name = name;
        this.address = address;
        this.id_owner = id_owner;
        this.phone = phone;
        this.url_logo = url_logo;
        this.nit = nit;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId_owner() {
        return id_owner;
    }

    public void setId_owner(Long id_owner) {
        this.id_owner = id_owner;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUrl_logo() {
        return url_logo;
    }

    public void setUrl_logo(String url_logo) {
        this.url_logo = url_logo;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
