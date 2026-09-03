package com.seatly.controller;

import com.seatly.dto.facility.FacilityCreateRequest;
import com.seatly.dto.facility.FacilityResponse;
import com.seatly.service.FacilityService;
import org.springframework.web.bind.annotation.*;

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
}