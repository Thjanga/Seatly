package com.seatly.controller;

import com.seatly.dto.facility.FacilityCreateRequest;
import com.seatly.dto.facility.FacilityResponse;
import com.seatly.dto.facility.FacilityUpdateRequest;
import com.seatly.dto.user.UserResponse;
import com.seatly.dto.user.UserUpdateRequest;
import com.seatly.service.FacilityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facilities")
public class FacilityController {

    private final FacilityService facilityService;

    public FacilityController(FacilityService facilityService) {
        this.facilityService = facilityService;
    }

    @PostMapping
    public FacilityResponse createFacility(
            @RequestBody FacilityCreateRequest request
    ) {
        return facilityService.createFacility(request);
    }

    @GetMapping("/{id}")
    public FacilityResponse getFacility(@PathVariable Long id){
        return facilityService.getFacility(id);
    }

    @GetMapping
    public List<FacilityResponse> getFacilities() {
        return facilityService.getFacilities();
    }

    @PatchMapping("/{id}")
    public FacilityResponse updateFacility(@PathVariable Long id, @RequestBody FacilityUpdateRequest request){
        return facilityService.updateFacility(id,request);
    }
}