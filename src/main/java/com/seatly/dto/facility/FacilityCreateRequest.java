package com.seatly.dto.facility;

public class FacilityCreateRequest {

    private String name;
    private String description;
    private Integer capacity;

    protected FacilityCreateRequest() {
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