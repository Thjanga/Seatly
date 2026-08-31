package com.seatly.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "facilities")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Integer capacity;

    protected Facility(){

    }

    public Facility(String name, String description, Integer capacity) {
        this.name = name;
        this.description = description;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getCapacity() {
        return capacity;
    }

}
