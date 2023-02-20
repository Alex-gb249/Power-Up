package com.alexis.restaurant.infrastructure.output.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "plates")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Long id_category;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private Long price;
    @Column(nullable = false)
    private Long id_restaurant;
    @Column(nullable = false)
    private String url_image;
    @Column(nullable = false)
    private Boolean active;
}
