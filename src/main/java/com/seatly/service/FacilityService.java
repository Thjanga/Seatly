package com.seatly.service;

import com.seatly.domain.Facility;
import com.seatly.dto.facility.FacilityCreateRequest;
import com.seatly.dto.facility.FacilityResponse;
import com.seatly.repository.FacilityRepository;
import org.springframework.stereotype.Service;

@Service
public class FacilityService {

    private final FacilityRepository facilityRepository;

    public FacilityService(FacilityRepository facilityRepository) {
        this.facilityRepository = facilityRepository;
    }

    public FacilityResponse createFacility(FacilityCreateRequest request) {
        Facility facility = new Facility(
                request.getName(),
                request.getDescription(),
                request.getCapacity()
        );

        Facility savedFacility = facilityRepository.save(facility);

        return new FacilityResponse(savedFacility);
    }
}