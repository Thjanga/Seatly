package com.seatly.dto.facility;

import com.seatly.domain.Facility;

public class FacilityResponse {

    private final Long id;
    private final String name;
    private final String description;
    private final Integer capacity;

    public FacilityResponse(Facility facility) {
        this.id = facility.getId();
        this.name = facility.getName();
        this.description = facility.getDescription();
        this.capacity = facility.getCapacity();
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