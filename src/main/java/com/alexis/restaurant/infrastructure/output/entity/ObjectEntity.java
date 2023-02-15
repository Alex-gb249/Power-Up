package com.alexis.restaurant.infrastructure.output.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "objectTable")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ObjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "object_id", nullable = false)
    private Long id;
    @Column(length = 50)
    private String name;
}
