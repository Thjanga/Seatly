package com.seatly.dto.facility;

public class FacilityUpdateRequest {
    private String name;
    private String description;
    private Integer capacity;

    protected FacilityUpdateRequest() {
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
